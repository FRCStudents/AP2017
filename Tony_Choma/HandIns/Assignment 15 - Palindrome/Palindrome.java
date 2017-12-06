import java.util.*;

public class Palindrome{
        String reverse;
        String original;
        public void pconvert(String input){
                String reverse = new StringBuffer(input).reverse().toString();
                
                if(reverse.equalsIgnoreCase(input)){
                        System.out.println("This phrase is a Palindrome");
                }else{
                        System.out.println("This phrase isn't a Palindrome");
                }
}
        public static void main(String[] args) throws java.lang.Exception {
                Palindrome p = new Palindrome();
                Scanner s = new Scanner(System.in);
                System.out.println("Check to see that this phrase is a palindrome: ");
                String userInput = s.nextLine();
                p.pconvert(userInput);
        }
}
