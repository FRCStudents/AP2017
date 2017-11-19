public class SentenceAnalysisDiver{
	public static void main (String [] argv){
		SentenceAnalysis s = new SentenceAnalysis();

		s.setSentence();
		System.out.println("Word count: " + s.findWordCount());
		s.sumWordLengths();
		System.out.println("Average Word Length:" + s.calculateAverageWordLength());
	}
}