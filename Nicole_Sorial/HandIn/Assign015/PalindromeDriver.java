class PalindromeDriver{
	public static void main(String[] argv) {

		Palindrome p = new Palindrome();

		p.acceptPal();
		p.removeSpaces();
		p.lowerCase();
		p.printAnswer(p.isPalindrome(p.final_pal));
	}
}