import java.util.*;
public class SentenceAnalysis{
	String sentence;

	public void readSentence(){
		System.out.println(sentence);
	}

	public void setSentence(){
	System.out.println("Enter your sentence:");	
	Scanner s = new Scanner (System.in);
	sentence = s.next();

	}

	public int findWordCount(){
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++){
            if ((sentence.charAt(i) != ' ') || (sentence.charAt(i) != '.')){
                wordCount++;
            }
        }
        return wordCount;
    }

    public int sumWordLengths(){
        int wordLength = 0;
        for (int i = 0; i < sentence.length(); i++){
            if ((sentence.charAt(i) != ' ') || (sentence.charAt(i) != '.')){
                wordLength++;
            }
        }
        return wordLength;
    }

    public double calculateAverageWordLength(){
        return ((double)sumWordLengths()/findWordCount());
    }
}