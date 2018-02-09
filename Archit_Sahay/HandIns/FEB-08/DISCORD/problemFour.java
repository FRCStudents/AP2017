import java.util.*;

public class problemFour{

		
		public static  void divider(int a){
			
			if (a % 6 == 0){ System.out.println("Hah ha 6-Divisor Dude"); }
			else{ System.out.println("(Bummer and a half)"); }
	 	}
	
	public static void main(String[] argv){
		Scanner scan = new Scanner(System.in);
		System.out.println  ("put number");
		int a = scan.nextInt();
		divider(a);
	}	
}	