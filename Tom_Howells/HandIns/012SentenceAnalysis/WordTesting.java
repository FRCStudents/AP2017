class WordTesting {
    public static int words;
    public static void main(String[] args){
        String s = "This is a sentence.";
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) == ' ') || (s.charAt(i) == '.')){
                words++;
            }
        }

        System.out.println(words);
    }
}