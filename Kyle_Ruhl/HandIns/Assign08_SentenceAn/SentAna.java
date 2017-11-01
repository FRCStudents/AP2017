public class SentAna{

	//the sentence for analysis is:
	String sentence = "Hello my name is Josephine and I like to run long distances, for example, yesterday I ran one hundred miles";
	int wordCount = 20;
	double averageWordSize = 4.30;

	
	//calculating the word count 
	void wordCount(String sentence){
	int wordStart = 0;
	int wordFinish = 1;
	int totalWords = 0;
	
	String currentWord;
	
	//wordCount = 0;
	
	currentWord = sentence.substring(0, sentence.indexOf(' ')).trim();
	wordCount++;
	
	totalWords = currentWord.length();
	
	wordStart = sentence.indexOf(' ', wordStart + 1);
	wordFinish = sentence.indexOf(' ', wordStart + 1);
	
	while ((wordStart < wordFinish) && (wordStart < sentence.length()-1)){
		currentWord = sentence.substring(wordStart, wordFinish).trim();
		wordCount++;
		totalWords += currentWord.length();
		wordStart = sentence.indexOf(' ', wordStart + 1);
		wordFinish = sentence.indexOf(' ', wordStart + 1);
	}
	


	//getting the average word size
	currentWord = sentence.substring(wordStart).trim();
	wordCount++;
	totalWords += currentWord.length();
	averageWordSize = totalWords / wordCount;
	}
	
}