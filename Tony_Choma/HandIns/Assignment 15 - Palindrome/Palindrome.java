import java.util.*;

public class Palindrome{
        public static void pchecker(String input){
                System.out.println(input);
        }

        public static void main(String[] args){
                Palindrome p = new Palindrome();
                Scanner s = new Scanner(System.in);
                System.out.println("Check to see that this phrase is a palindrome: ");
                String userInput = s.nextLine();
                pchecker(userInput);
        }
}
