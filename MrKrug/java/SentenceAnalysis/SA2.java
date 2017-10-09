import java.util.Scanner;

public class SA2 {
  private  String sentence = "";
  private  int wordCount = 0;
  private  int averageWordSize = 0;



  /*
   * fixSentence
   * this removes all repeating spaces and punctuation from the 
   * sentence... 
   *
   */

  public void fixSentence(){
  	char c = ' ';
	char prevChar;
	String replace = "";

	for(int i=0; i < sentence.length(); i++){
		prevChar = c;
		c = sentence.charAt(i);
		if(((c >= 'a') && ( c <= 'z')) || ((c >= 'A') && (c <= 'Z')))
			replace += c;
		if((c == ' ') && (prevChar == ' ')) continue;
		if(c == ' ')
			replace += c;
		}
	sentence = replace;
  }
	
  /*
   * scanSentence
   * @param - none
   * @return - void
   *
   * IO for a sentence from the user
   * sideEffect: populates attribute: sentence
   *
   */

  public  void scanSentence(){
    Scanner reader = new Scanner(System.in);
    sentence = reader.nextLine();
    sentence = sentence.trim();
  }




	
  /*
   * promptForSentence
   * @param - alternative prompt
   * @return - void
   * Writes prompt to console
   *
   */

  public void promptForSentence(String prompt){
	if(!prompt.trim().equals("") ){
		System.out.print(prompt);
	} else {
		System.out.print("Please, enter a sentence: ");
	}
  }





  /*
   * analyzeSentence 
   * sideEffect: populates attribute: wordCount - based on new sentence
   * sideEffect: populates attribute: averageWordSize -
   *                    based on new sentence and wordCount
   *
   */

  private  void analyzeSentence(){
      	int wordBegin = 0;
      	int wordEnd = 1;
      	int sumLengths = 0;

      	String currentWord;

      	wordCount = 0;

	currentWord = sentence.substring(0, sentence.indexOf(' ')).trim();
	wordCount++;
	//System.out.println("First Word: '" + currentWord + "'");
	sumLengths = currentWord.length();

      	wordBegin = sentence.indexOf(' ', wordBegin + 1);
      	wordEnd = sentence.indexOf(' ', wordBegin + 1);

      	while ((wordBegin < wordEnd) && (wordBegin < sentence.length() - 1)){
         	currentWord = sentence.substring(wordBegin, wordEnd).trim();
		wordCount++;
		sumLengths += currentWord.length();
               	wordBegin = sentence.indexOf(' ', wordBegin + 1);
               	wordEnd = sentence.indexOf(' ', wordBegin + 1);
		//System.out.println("Iteration: '" + currentWord + "' (" + wordCount + ")(" + sumLengths + ")");
		}  
	currentWord = sentence.substring(wordBegin).trim();
	wordCount++;
	sumLengths += currentWord.length();
	averageWordSize = sumLengths / wordCount;
  }





  /*
   * scanAnalyzePrint
   * runs this object through everything it can do
   */

  public  void scanAnalyzePrint(){
	promptForSentence("");
	scanSentence();
	fixSentence();
	analyzeSentence();
	printSentence();
  }



  /*
   * printAnalysis  
   * prints to console
   * Sentence
   * Number of words
   * Average word length  
   *
   */



  public  void printSentence(){
    System.out.println("Sentence: '" + sentence + "'");
    System.out.println("Word Count: " + wordCount);
    System.out.println("Average Word Size: " + averageWordSize);
  }

}
