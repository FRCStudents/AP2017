import java.util.*;
public class SentAnalysis{

	String sentence; 
	int wordCount = 0; 	
	double averageWordSize = 0;
	
	public void wordCount(String sentence){
	int Start = 0;
	int Finish = 1;
	int Total = 0;
	
	Scanner hippo = new Scanner(System.in);
	System.out.println ("Give me the sentence ");
	sentence = hippo.nextLine();
	System.out.println(" ");
	System.out.println ("Your sentence: " + sentence);
	
	String currentWord;
		
	currentWord = sentence.substring(0, sentence.indexOf(' ')).trim();
	wordCount++;
	
	Total = currentWord.length();
	
	Start = sentence.indexOf(' ', Start + 1);
	Finish = sentence.indexOf(' ', Start + 1);
	
	while ((Start < Finish) && (Start < sentence.length()-1)){
		currentWord = sentence.substring(Start, Finish).trim();
		wordCount++;
		Total += currentWord.length();
		Start = sentence.indexOf(' ', Start + 1);
		Finish = sentence.indexOf(' ', Start + 1);
	}
	
	currentWord = sentence.substring(Start).trim();
	wordCount++;
	Total += currentWord.length();
	averageWordSize = Total / wordCount;
	}
	
}	