import java.util.Scanner;
import java.util.Arrays;

public class IsPalindrome {
  public static void palindromeCheck(String value) {
    int length = value.length() - 1;
    String[] placeholder = new String[length + 1];
    StringBuilder strBuilder = new StringBuilder();
    for(int i = 0; i <= length; i++){
      String nextValue = Character.toString(value.charAt(length-i));
      strBuilder.append(nextValue);
    }
    String reversedWord = strBuilder.toString();
    if(reversedWord.equalsIgnoreCase(value)){
      System.out.println("\n\n " + value + " is indeed a palindrome!");
    } else{
      System.out.println("\n\n " + value + " is not a palindrome!");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter text to test if it a palindrome: \n       >>> ");
    String testValue = sc.next();
    palindromeCheck(testValue);
  }
}
