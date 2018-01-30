// an object that:
// 1) prints a string
// 2) filters out the spaces and prints the string
// 3) increases each letter by two places and prints out the string
//  **(copy string from one string to another)

import java.util.*;

class SentenceEdit {

	// ATTRIBUTES
	String original_string = "";
	String string_no_spaces = "";
	String string_update_char = "";
	char[] alphabet = new char[26];
	Scanner s = new Scanner(System.in);
	int idx;

	SentenceEdit() {
		String original_string = "";
		String string_no_spaces = "";
		String string_update_char = "";
		char[] alphabet = new char[26];
		Scanner s = new Scanner(System.in);
		int idx = -1;
	}

	// METHODS

	// creates an array of the chars of the alphabet
	public void alphabet() {
		int index = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			alphabet[index++] = c;
		}
	}

	// accepts a sentence from user input/scanner
	public String acceptString() {
		System.out.println("Please input a sentence (no punctuation please!");
		original_string = s.nextLine();
		return original_string;
	}

	public void printString(String print_string) {
		System.out.println(print_string);
	}

	// creates new string with no spaces
	public String filterSpaces() {
		for (int i = 0; i < original_string.length(); i++) {
			if (original_string.charAt(i) == ' ') {
				string_no_spaces = string_no_spaces;
			} else {
				string_no_spaces = string_no_spaces + original_string.charAt(i);
			}
		}
		return string_no_spaces;
	}

	// helper function to set index to be the index of a char in alphabet[]
	public void setIndex(int x) {
		idx = x;
	}

	// changes each char in a string to be two places forward
	public String updateString() {
		original_string = original_string.toLowerCase();
		for (int i = 0; i < original_string.length(); i++) {
			// makes i usable in inner for loop
			int x = i; 

			// loops through whole alphabet to find char's index
			for (int j = 0; j < 26; j++) { 
				if (original_string.charAt(x) == alphabet[j]) {
					setIndex(j); 
				}
				if (original_string.charAt(x) == ' ') {
					setIndex(-2);
				}
			}

			// accounts for the end of the alphabet looping back to the beginning
			if (idx == 24) { 
				string_update_char = string_update_char + 'a';
			} else if (idx == 25) {
				string_update_char = string_update_char + 'b';
			} else if (idx == -2) {
				string_update_char = string_update_char + ' ';
			} else {
				string_update_char = string_update_char + alphabet[idx + 2];
			}
		}
		return string_update_char;
	}
}