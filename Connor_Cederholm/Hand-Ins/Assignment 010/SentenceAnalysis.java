import java.util.scanner
public class SentenceAnalysis{
	Scanner S = new Scanner (System.in);
	String sentence = S.nextline();

	String readSentence(){
		System.out.println(sentence);
	}

	String getSentence(){
		return sentence;
	}

	void setSentence(String ss){
	sentence = ss;
	}

	int calcAverageWordLength(){
		
	}
}