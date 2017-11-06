import java.util.Scanner;

class palindrome{


	public void getIt(){
	
		Scanner isIt = new Scanner(System.in);
		System.out.println("Type in your word(s) to check if it is a palindrome!");
		String imput = isIt.nextLine();
		
		imput = imput.toLowerCase();
		String SpacelessImput = imput.replaceAll("\\s+",""); //gets rid of spaces from the imput
	
	}

	public void theChecker(char[] SpacelessImput){
	    int a = 0;
	    int b = SpacelessImput.length - 1;
	    while (b > a) {
	        if (SpacelessImput[a] != SpacelessImput[b]) {
	            System.out.println("No, this is not a palindrome");
	        }
	        ++a;
	        --b;
	    }
	    System.out.println("Yes, this is a palindrome");
	}
}
