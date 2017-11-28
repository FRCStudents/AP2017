import java.util.Scanner;

public class Palindrome{
	
	String Input = "";

	public boolean getTheInput(){
	
		Scanner isIt = new Scanner(System.in);
		System.out.println("Enter your input please");
		String input = isIt.nextLine();
		
		input = input.toLowerCase(); 
		String Input = input.replaceAll("\\s+","");
		
		char[] charArray = Input.toCharArray();
	    int b = 0;
	    int r = charArray.length - 1;
	   
	    while (r > b) {       
		    if (charArray[b] != charArray[r]) {
				System.out.println("This is not a palindrome");
				return false;     
	        }
			
			++b;
	        --r;
	    }

		System.out.println("This is a palindrome");
		return true;   
	}
}