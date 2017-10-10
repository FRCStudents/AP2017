import java.util.*;

public class SentenceAnalyze {
	private String input;
	private int words;

	public void readSentence(String input){
		this.input = input;
	}
	public int calcAverageWordLength() {
		return;
	}
	public int sumWordLength(){
		input.split(" ", )
	}
	public int getNumOfWords(){
		int tempWords = 0;
		for(int i = 0; i < input.length; i ++) {
			if(s.charAt(i) == ' ' || s.charAt(i) == '.') {
				tempWord ++;
			}
		}
		this.words = tempWords;
		return tempWord;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		SentenceAnalyze newS = new SentenceAnalyze();
		newS.readSentence(sentence);
	}
}