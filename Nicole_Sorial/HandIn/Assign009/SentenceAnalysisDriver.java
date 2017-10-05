class SentenceAnalysisDriver{

	public static void main(String[] argv) {
		SentenceAnalysis s = new SentenceAnalysis(argv[0]);
		System.out.println("Sentence: " + s.readSentence()); // Print sentence
		System.out.println("Sentence length: " + s.getNumberOfWords() + " word(s)"); // Print sentence length
		System.out.println("Sum of word lengths: " + Integer.toString(s.sumWordLengths())); // Print sum of word lengths
		System.out.println("Average word length: " + Double.toString(s.calcAverageWordLength())); // Print average word length
	}
}