public class SentenceAnalysisDriver{

	public static void main(String[] argv){
		
		SentenceAnalysis q = new SentenceAnalysis();
		
		System.out.println("The Sentence is: " + q.sentence);
		System.out.println("The number of words are: " + q.number_of_words);
		System.out.println("The average word size is: " + q.average_word_size);
		System.out.println("Success");
		
	}

}