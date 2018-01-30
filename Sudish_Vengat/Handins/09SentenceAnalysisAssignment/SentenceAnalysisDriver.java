public class SentenceAnalysisDriver {
    
    public static void main(String[] args){

		SentenceAnalysis a = new SentenceAnalysis("Please analyze this sentence");
        System.out.println(a.readSentence());
        System.out.println("Your Word Number is " + a.getWordNum());
        System.out.println("Your Total Word Length is " + a.sumWordLengths());
        System.out.println("Your Average Word Lenght is " + a.calculateAverageWordLength());
    }
}