class SA{
    private String s;

    public SA(String x){
        s = x;
    }

    public String readSentence(){
        return s;
    }

    public int getWordNum(){
        int wordNum = 0;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) == ' ') || (s.charAt(i) == '.')){
                wordNum++;
            }
        }
        return wordNum;
    }

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