import java.util.*;

public class HiddenWord2{
	private String word;
	
	public HiddenWord2(String b){
		//The word is set in the file driver2.java
		//note: The hidden word must be 6 letters long for the correct use of this program.
		word = b;
	}
	
	public String getHint(String guess){
		/*
		* The following sets up three Character Arrays
		*
		* WordArr is the hidden word, but broken up into characters
		*
		* ARR is the guess, broken up into characters. The string is inputed in the driver via a scanner.
		*
		* The hint array is the hint that will be retuned at the end, in a character form.
		* It is set as the length of the guess and will be the same size, so that the user can input
		* less than 6 letters to check and it will still work. The hint array is later transferred back into
		* a String so that it can be retuned. 
		*
		*/
		
		char[] wordArr = word.toCharArray();
		char[] ARR = guess.toCharArray();
		char[] hint = new char[ARR.length]; 
		
		for (int j = 0; j < ARR.length; j++){
			/* 
			* This for loop is the main loop- then there are three options. It can either be the letter,
			* where it would set the letter guessed in that position to the position in the hint array.
			* It could also find that the letter is in the word but not in the right position, and it will
			* put a '+' character in the spot to indicate such. Lastly, it could loop through the array and find
			* that the letter isn't in the word at all, and put an '*' in its place on the hint array.
			*/
			if (ARR[j] == wordArr[j]){
				hint[j] = wordArr[j];
			}
			
			for (int h = 0; h < ARR.length; h++){
				//secondary for loop, nested in the one above. 
				//j can't be = to h because it would override the correct letter placement 
				if ((ARR[j] == wordArr[h]) && (j != h)){
					hint[j] = '+';
				}
			}
			
			if (ARR[j] != wordArr[0] && ARR[j] != wordArr[1] && ARR[j] != wordArr[2] && ARR[j] != wordArr[3] && ARR[j] != wordArr[4] && ARR[j] != wordArr[5]){
				//the values would need to change above if you were to change the length of the hidden word from 6.
				hint[j] = '*';
				}
			}
			
		//The below changes the char array hint back into a String so that it can be returned
		String output = String.valueOf(hint);
		return output;
	}
}
