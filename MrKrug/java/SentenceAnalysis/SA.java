import java.util.Scanner;

public class SA {
  private  String sentence = "";
  private  String currentWord = "";
  private  int currentIndex = 0;
  private  int wordCount = 0;
  private  int averageWordSize = 0;

  /*
   * also lasts wordCount and averageWordSize
   */
  public  void scanSentence(){
    Scanner reader = new Scanner(System.in);
    sentence = reader.nextLine();
    wordCount = countWords();
    averageWordSize = addWordSizes()/countWords();
  }

  public void promptForSentence(){
	System.out.print("Please, enter a sentence: ");
  }

  /*
   * changes currency
   * returns true/false - depending on if it is the last word or not.
   * in this case, the last word gets loaded into current, but we return false.
   */
  public  boolean getNextWord(){
      int wordBegin;
      int wordEnd;

      if(currentIndex < sentence.length() - 1){
        wordBegin = sentence.indexOf(' ', currentIndex + 1);
        wordEnd = sentence.indexOf(' ', wordBegin + 1);
        if(wordEnd > wordBegin){
          currentWord = sentence.substring(wordBegin, wordEnd).trim();
          currentIndex = wordBegin;
          return true;
        } else {
          currentWord = sentence.substring(wordBegin).trim();
          currentIndex = wordBegin;
          return false;
        }
      }
      return false;
  }

  /*
   * load the currentWord with the first word
   */
  public  void getFirstWord(){
      currentIndex = 0;
      currentWord = sentence.substring(0, sentence.indexOf(' ', 1)).trim();
  }

  /*
   * prints the current word... that's all
   */
  public  void printCurrent(){
    System.out.println(currentWord);
  }

  /*
   * prints each word in the sentence
   */
  public  void printEachWord(){
    getFirstWord();
    printCurrent();
    while (getNextWord()){
      System.out.println(currentWord);
    }
    System.out.println(currentWord);
  }

  private  int countWords(){
    int wordCount = 0;
    getFirstWord();
    wordCount++;
    while (getNextWord()){
      wordCount++;
    }
    wordCount++;
    return wordCount;
  }

  public  int getCurrentWordSize(){
    return currentWord.length();
  }

  private  int addWordSizes(){
      int sum = 0;
      getFirstWord();
      sum = getCurrentWordSize();
      while(getNextWord()){
        sum += getCurrentWordSize();
      }
      sum += getCurrentWordSize();
      return sum;
  }

  public  void printSentence(){
    System.out.println("Sentence: '" + sentence + "'");
    System.out.println("Word Count: " + wordCount);
    System.out.println("Average Word Size: " + averageWordSize);
  }

}
