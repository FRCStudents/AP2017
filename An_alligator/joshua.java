public class joshua{
	int juice = 0;

	public joshua(int x){
		juice = x;
	}

	public joshua(){
		juice = 17;
	}

	public void printe(String x){
		System.out.println(x);
	}

	public static void main(String[] args){
		joshua x= new joshua(Integer.parseInt(args[0]));
		System.out.println(x.juice);
		System.out.println(args.length);
	}
}
