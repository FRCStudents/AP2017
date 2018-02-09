public class Problem4{
	
	public static void divideInteger(int i){
		if(i % 6 == 0){
			System.out.print("Hah ha 6-divisor dude"); 
		} else {
			System.out.print("Bummer and a half");
		}
	}

	public static void main(String[] args){
		divideInteger(18);
	}
}
