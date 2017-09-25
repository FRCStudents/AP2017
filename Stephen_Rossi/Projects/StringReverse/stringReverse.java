import java.util.Scanner;

public class stringReverse {
  static String defaultString = "Mr. Krug";
  static String[] reverseString;
  static String[] defaultArray;
  static String[] reverseArray;
  static String reverseWord;

  public static String getDefaultString(){
    return defaultString;
  }
  public static void setDefaultString(String newString){
    defaultString = newString;
  }
  public static void reverseString() {
    defaultArray = defaultString.split("");
    int y = 0;
    reverseArray = new String[defaultArray.length];
    for(int x = defaultArray.length -1 ; x >= 0; x--) {
      reverseArray[y] = defaultArray[x];
      y++;
    }
    reverseWord = String.join("", reverseArray);
  }
  public static void printString(){
    System.out.println("Default String: " + defaultString);
    System.out.println("Reversed String: " + reverseWord);
  }
  public static void startMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.print("What string would you like to reverse? Please type it below \n                    >>> ");
    String userInput = sc.nextLine();
    defaultString = userInput;
    reverseString();
    printString();
  }
  public static void main(String[] args){
    startMenu();
  }
}
