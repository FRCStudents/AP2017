class SentenceAnalysis {
	
	// Attributes
	private int num_words = 0;
	public String original_sentence;
	private String sentence;
	private int total_length;
	private int word_length;

	// Constructors
	SentenceAnalysis() {
		original_sentence = "I love dogs so much";
	}

	SentenceAnalysis(String a) {
		original_sentence = a;
	}


	// Methods
	public String readSentence() {
		return original_sentence;
	}
	public boolean isSentence() { // helper function
		return original_sentence.contains(" ");
	}

	/*
    	 * Notice - you are destroying your attribute sentence here!
         * That could be alright (you need to know it and make it clear to your
  	 * clients)...
	 * Or, you may want to keep a copy of it and then restore the copy
	 * Or, you can copy it, and destroy the copy...
	 *
	 * VERY nicely done! Awesome! I'm dancing!
	 *
	 */


	/* 
	 * You could also simply return an int from getNumberOfWords()...
	 * rather than converting the String after the fact...
	 */

	public String getNumberOfWords() {
		if (isSentence()) {
			num_words = 1;
			sentence = original_sentence;
			for (int new_word = 0; sentence.substring(new_word + 1).contains(" "); new_word = sentence.indexOf(" ")) {
				num_words++;
				sentence = sentence.substring(new_word + 1);
			}
			return Integer.toString(num_words);
		} 
		return "Not a sentence, only one";
	} 
	public int sumWordLengths() {
		if (isSentence()) {
			sentence = original_sentence;
			total_length = 0;
			for (int new_word = 0; sentence.substring(new_word).contains(" "); new_word = 0) {
				word_length = sentence.substring(0, sentence.indexOf(" ")).length();
				total_length = total_length + word_length;  // will end with sum of everything except last word
				sentence = sentence.substring(sentence.indexOf(" ") + 1);
			}
			total_length = total_length + sentence.length(); // adds last word to sum
			return total_length;
		}
		return 0;
	}
	public double calcAverageWordLength() {
		return (double) sumWordLengths() / (double) Integer.parseInt(getNumberOfWords());
	}
} 
