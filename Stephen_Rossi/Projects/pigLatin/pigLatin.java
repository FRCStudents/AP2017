import java.util.Scanner;

class PigLatin {
  static String defaultWord = "PigLatin";
  static String[] defaultArray;
  static String[] translatedArray;
  static String translatedWord;

  public String getDefaultWord(){
    return defaultWord;
  }
  public String getTranslatedWord(){
    return translatedWord;
  }
  public void setDefaultWord(String newWord){
    defaultWord = newWord;
  }
  public void setTraslatedWord(String newWord){
    translatedWord = newWord;
  }
  public static void startMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.print("What string would you like to reverse? Please type it below \n                    >>> ");
    String userInput = sc.nextLine();
    defaultWord = userInput;
    translate();
    printAll();
  }
  public static void translate() {
    defaultArray = defaultWord.split("");
    translatedArray = new String[defaultArray.length+2];
    String placeholder = defaultArray[0];
    placeholder = placeholder.toLowerCase();
    for(int x = 1; x < defaultArray.length; x++) {
      translatedArray[x-1] = defaultArray[x];
    }
    translatedArray[defaultArray.length -1] = placeholder;
    translatedArray[defaultArray.length] = "a";
    translatedArray[defaultArray.length + 1] = "y";
    translatedArray[0] = translatedArray[0].toUpperCase();
    translatedWord = String.join("", translatedArray);
  }
  public static void printAll() {
    System.out.println("User Inputed Word: " + defaultWord);
    System.out.println("Word Translated to PigLatin: " + translatedWord);
  }
  public static void main(String[] args) {
    startMenu();
  }
}
