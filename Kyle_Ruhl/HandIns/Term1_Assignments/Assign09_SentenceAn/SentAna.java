import java.util.*;
public class SentAna{

	String sentence; 
	int wordCount = 0; 		//starts at zero and increases later on
	double averageWordSize = 0;
	
	//this function will calculate the word count and average word size, also includes getting the inputted sentence
	public void wordCount(String sentence){
	int wordStart = 0;
	int wordFinish = 1;
	int totalWords = 0;
	
		//scanner for the inputed sentence
	Scanner hippo = new Scanner(System.in);
	System.out.println ("Please Enter Your Sentence: ");
	sentence = hippo.nextLine();
	System.out.println(" ");
	System.out.println ("Your sentence for analyzation is: " + sentence);
	
	String currentWord;
		
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
	
	/*
	* Note: All the answers will print though the driver with the excpetion 
	* of printing out the sentence that the user inputted.
	*/
}