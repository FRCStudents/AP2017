import java.util.Scanner;

class Palindrome{

	public boolean getPalindrome(){

		Scanner getPalindrome = new Scanner(System.in);
		System.out.println("Imput your word my child!");
		String input = getPalindrom.nextLine();

		imput = imput.toLowerCase();

		String lowercaseImput = imput;

		char[] charArray = lowercaseImput.toCharArray();

		int a = 0;
	    int b = charArray.length - 1;
	   
	    while (b > a) { 
	    	if (charArray[a] != charArray[b]) {
				System.out.println("Not a Palindrome, maybe some other type of word?");
				return false;

				 ++a;
	       		 --b;

	        }
	        System.out.println("Tis' a Palindrome");
		return true;   

	}
}
}