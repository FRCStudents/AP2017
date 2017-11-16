import java.util.*;

class Palindrome {

	String pal = ""; // original input
	String no_spaces = ""; // input with no whitespace
	String final_pal = ""; // input with no whitespace or upper case letters
	Scanner s = new Scanner(System.in);

	// Methods
	public void acceptPal() {
		System.out.println("Word that can be spelled the same forward and backwards is a palindrome");
		System.out.println("Write a word or phrase that can be a palindrome");
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
			System.out.println("Yes, this can work!");
		} else {
			System.out.println("No... idiot this doesn't work!");
		}
	}
	public static void main(String[] argv) {

		Palindrome p = new Palindrome();

		p.acceptPal();
		p.removeSpaces();
		p.lowerCase();
		p.printAnswer(p.isPalindrome(p.final_pal));
	}
}