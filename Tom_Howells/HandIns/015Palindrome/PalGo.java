class PalGo {
    public static void main(String[] args) {
        try {
            Palindrome a = new Palindrome(args[0]);

            System.out.println("Your original word/phrase was \"" + a.getOriginal() + "\"");
            System.out.println("The reversed word/phrase is \"" + a.getReverse() + "\"");
            System.out.println("\"" + a.getOriginal() + "\" palindrome status: " + a.isPalindrome());
        }
        catch (Exception e) {
            System.out.println("Please enter a word or phrase to be analyzed when running this class in the command line.");
            System.exit(0);
        }
    }
}