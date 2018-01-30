class SentenceDriver {
    public static void main(String[] args){
        //SentenceAnalysis a = new SentenceAnalysis(args[0]);

	SentenceAnalysis a = new SentenceAnalysis("Sudish is a person sitting next to me in my math class.");
        System.out.println(a.readSentence());
        System.out.println("Your Word Number is " + a.getWordNum());
        System.out.println("Your Total Word Length is " + a.sumWordLengths());
        System.out.println("Your Average Word Lenght is " + a.calculateAverageWordLength());
    }
}
