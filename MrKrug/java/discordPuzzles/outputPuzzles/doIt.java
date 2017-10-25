
class Doit{
	static int i;
	static int j;
	static int[] intArray = new int[10];

	private static void doIt(){ 
		i = 0;
		j = 0;
		System.out.println("ready");
		for(int k=0; k<10; k++){
			System.out.print(k+2);
		}

		System.out.println("ready");
		for(int k=0; k<10; k+=2){
			System.out.print(k);
		}

		System.out.println("ready");
		for(int k=0; k<10; k+=i){
			i++;
			System.out.print(k);
		}
	 
	}

	public static void main(String [] argv){
		doIt();
		}
}

