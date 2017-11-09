class Palindrome {
    private String originalWord = "";
    private String reverseWord = "";

    public Palindrome(String x) {
        originalWord = x.replaceAll("\\W", "").toLowerCase();

        for(int i = originalWord.length() - 1; i >= 0; i--){
            reverseWord += originalWord.charAt(i);
        }
    }
    public Palindrome() {
        String x = "Evil olive";
        originalWord = x.replaceAll("\\W", "").toLowerCase();

        for(int i = originalWord.length() - 1; i >= 0; i--){
            reverseWord += originalWord.charAt(i);
        }
    }

    public String getOriginal() {
        return originalWord;
    }
    public String getReverse() {
        return reverseWord;
    }

    public boolean isPalindrome() {
        return originalWord.equals(reverseWord);
    }
}