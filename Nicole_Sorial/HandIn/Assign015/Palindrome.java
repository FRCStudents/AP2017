import java.util.*;

class Palindrome {

	// Attributes
	String pal = ""; // original input
	String no_spaces = ""; // input with no whitespace
	String final_pal = ""; // input with no whitespace or upper case letters
	Scanner s = new Scanner(System.in);

	// Methods
	public void acceptPal() {
		System.out.println("A palindrome is a word or phrase that is the same spelled forward and backwards");
		System.out.println("Enter a word or phrase (no punctuation or apostrophes) to see if it's a palindrome!");
		pal = s.nextLine();
	}

	public void removeSpaces() {
		for (int i = 0; i < pal.length(); i++) {
			if (pal.charAt(i) == ' ') {
				no_spaces = no_spaces;
			} else {
				no_spaces = no_spaces + pal.charAt(i);
			}
		}
	}

	public void lowerCase() {
		final_pal = no_spaces.toLowerCase();
	}

	public boolean isPalindrome(String word) {
		int x = 1; // counter from the end of the string
		for (int i = 0; i <= (word.length() / 2); i++) {
			if (word.charAt(i) == word.charAt(word.length() - x)) {
				x++;
			} else {
				return false;
			}
		}
		return true; // if loop never returns false, then input is a palindrome
	}

	public void printAnswer(boolean x) {
		if (x) {
			System.out.println("Yes, it's a palindrome!");
		} else {
			System.out.println("Sorry, not a palindrome!");
		}
	}



}