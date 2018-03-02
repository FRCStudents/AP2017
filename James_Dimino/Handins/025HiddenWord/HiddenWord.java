import java.util.*;

public class HiddenWord {
	
	private String theWord;
	private char[] compileGuess = new char[5];
	private char[] guessWord = new char[5];
	private char[] theWordArray = new char[5];
	private int i = 0;

	public HiddenWord(String s) {
		theWord = s;
	}

	public void getHint(String n) {
		theWordArray = theWord.toCharArray();
		guessWord = n.toCharArray();

		if (n.equals(theWord)){
			System.out.println("You Guessed The Word!");
		}

		while (i < 5){
			if (guessWord[i] == theWordArray[i]) {
				compileGuess[i] = guessWord[i];
				i++;
				System.out.println("i");
			}
			for (int j = 0; j < n.length(); j++) {
					System.out.println("HERE");
				if (guessWord[i] == theWordArray[j] && i != j) {
					compileGuess[i] = '+';
					i++;
					System.out.println("j");
				}
			}
			for (int z = 0; z < n.length(); z++) {
					System.out.println(guessWord[i]);
				if (guessWord[i] != theWordArray[z]) {
					compileGuess[i] = '*';
					i++;
					System.out.println("z");
				}
			}
		}

		for (int b = 0; b < compileGuess.length; b++) {
			System.out.println("\n");
			System.out.print("Here's Your Hint: " + compileGuess[b]);
			System.out.println("\n");
		}
	}
}