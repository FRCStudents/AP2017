class SentenceObj {
    // vars
    private String s;

    // constructor
    public SentenceObj(String x){
        s = x;
    }



    // function for determining if char is/is not letter



    // retrieves s
    public String readSentence(){
        return s;
    }

    // calculates number of words
    public int getWordNum(){
        int wordNum = 0;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) == ' ') || (s.charAt(i) == '.')){
                wordNum++;
            }
        }
        return wordNum;
    }

    // calculates character (not spaces or periods)
    public int sumWordLengths(){
        int wordLength = 0;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) != ' ') || (s.charAt(i) != '.')){
                wordLength++;
            }
        }
        return wordLength;
    }

    public double calculateAverageWordLength(){
        return ((double)sumWordLengths()/getWordNum());
    }
}