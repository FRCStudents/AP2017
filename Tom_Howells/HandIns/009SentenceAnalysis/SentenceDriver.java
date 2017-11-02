class SentenceDriver {
    public static void main(String[] args){
        SentenceObj a = new SentenceObj(args[0]);

        System.out.println(a.readSentence());
        System.out.println("Word Number - " + a.getWordNum());
        System.out.println("Sum of Word Lengths - " + a.sumWordLengths());
        System.out.println("Average Word Length - " + a.calculateAverageWordLength());
    }
}