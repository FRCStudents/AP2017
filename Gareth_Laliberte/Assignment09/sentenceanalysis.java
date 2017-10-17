class sentenceanalysis {
	
	private int numWords = 0;
	public String ogSentence;
	private String sentence;
	private int completeLength;
	private int wordLength;

	SentenceAnalysis() {
		ogSentence = "Hello world it's great to be";
	}

	SentenceAnalysis(String a) {
		ogSentence = a;
	}


	public String checkSentence() {
		return ogSentence;
	}
	public boolean isSentence() { 
		return ogSentence.contains(" ");
	}

	public String getNumberOfWords() {
		if (isSentence()) {
			numWords = 1;
			sentence = ogSentence;
			for (int newWord = 0; sentence.substring(newWord + 1).contains(" "); newWord = sentence.indexOf(" ")) {
				numWords++;
				sentence = sentence.substring(newWord + 1);
			}
			return Integer.toString(numWords);
		} 
		return "Just one.";
	} 
	public int sumWordLengths() {
		if (isSentence()) {
			sentence = ogSentence;
			totalLength = 0;
			for (int newWord = 0; sentence.substring(newWord).contains(" "); newWord = 0) {
				wordLength = sentence.substring(0, sentence.indexOf(" ")).length();
				totalLength = totalLength + wordLength; 
				sentence = sentence.substring(sentence.indexOf(" ") + 1);
			}
			total_length = totalLength + sentence.length();
			return totalLength;
		}
		return 0;
	}
	public double calcAverageWordLength() {
		return (double) sumWordLengths() / (double) Integer.parseInt(getNumberOfWords());
	}
} 
