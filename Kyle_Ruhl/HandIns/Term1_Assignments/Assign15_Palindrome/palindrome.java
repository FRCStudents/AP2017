import java.util.Scanner;
class palindrome{
	
	String SpacelessImput = "";

	public boolean getIt(){
	/*
	*Scanner to get the input that the user wants
	*to see if its a palindrome
	*/
		Scanner isIt = new Scanner(System.in);
		System.out.println("Type in your word(s) to check if it is a palindrome!");
		String input = isIt.nextLine();
		
		input = input.toLowerCase(); //puts sentence in lower case to avoid string manipulation 
		String SpacelessInput = input.replaceAll("\\s+",""); //gets rid of spaces from the imput
		
		char[] charArray = SpacelessInput.toCharArray(); //converts SpacelessInput string into char array
	    int a = 0;
	    int b = charArray.length - 1;
	   
	    while (b > a) { 
			/*
			*this while loop stops once 'a' (first letter in char array) and 'b' (last letter in char array)
			*are right next to eachother in the sentence and will continue to run if the letters correspond.
			*/
	       
		    if (charArray[a] != charArray[b]) {
				System.out.println("No, this is not a palindrome");
				return false;     
	        }
			
			//subtracts from b and adds to a to check the next letters for palindromeinium
	        ++a;
	        --b;
	    }
		System.out.println("Yes, this is a palindrome");
		return true;   
	}
}