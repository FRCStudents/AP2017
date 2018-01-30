import java.util.Scanner;
public class Palindrome{



boolean getPalindrome() {
	Scanner p = new Scanner(System.in);
	System.out.println("Enter Word");
	String b = p.nextLine();
  	int c = b.length();
  for (int x = 0; x < (c/2); ++x) {
     if (b.charAt(x) == b.charAt(c - x - 1)) {
         System.out.println("Tis' a palindrome!");
         return true;
     }
  }
  System.out.println("No, not a palindrome");
  return false;
}
}