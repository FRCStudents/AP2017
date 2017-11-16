import java.util.Scanner;
public class palindromeChecker{



boolean isPalindrome() {
	Scanner p = new Scanner(System.in);
	System.out.println("Type your word");
	String b = p.nextLine();
  	int c = b.length();
  for (int x = 0; x < (c/2); ++x) {
     if (b.charAt(x) == b.charAt(c - x - 1)) {
         System.out.println("Congratualations it's a palindrome!");
         return true;
     }
  }
  System.out.println("No palindrome here");
  return false;
}
}