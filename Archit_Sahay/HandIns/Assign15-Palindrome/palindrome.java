import java.util.Scanner;
class palindrome{
	
	String SpacelessImput = "";

	public boolean isItTrue(){
	
		Scanner isIt = new Scanner(System.in);
		System.out.println("Type in your word(s) to check if it is a palindrome!");
		String input = isIt.nextLine();
		
		input = input.toLowerCase(); 
		String SpacelessInput = input.replaceAll("\\s+",""); 
		
		char[] charArray = SpacelessInput.toCharArray(); 
	    int a = 0;
	    int b = charArray.length - 1;
	   
	    while (b > a) { 
		
	       
		    if (charArray[a] != charArray[b]) {
				System.out.println("No palindrome detected");
				return false;     
	        }
			
			
	        ++a;
	        --b;
	    }
		System.out.println("This is a palindrome");
		return true;   
	}
}