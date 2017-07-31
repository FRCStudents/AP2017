/*
 * break apart email address
 */
import java.util.Scanner;

public class EmailBreak {
  static String part1, part2, part3;

  private static boolean checkDomain(String dom){
    if (dom.equals("com")) return true;
    if (dom.equals("org")) return true;
    if (dom.equals("edu")) return true;
    return false;
  }

  private static void errorPrint(int e){
      if(e == 0) System.out.println("You must enter an argument!");
      if(e == 1) System.out.println("You must be on drugs. Pathetic.");
  }

  public static void parseEmail(String email){
    int start = 0;
    int At = email.indexOf('@');
    int dot = email.indexOf('.');
    part1 = email.substring(start, At);
    part2 = email.substring(At + 1, dot);
    part3 = email.substring(dot + 1);
  }

  public static void main (String argv[]){
    Scanner reader = new Scanner(System.in);

    if(argv.length < 1){
      errorPrint(0);
      return;
    }

    String email = argv[0];
    parseEmail(email);
    if(checkDomain(part3)){
      System.out.println("You have entered the correct email, YAY!");
    } else {
      while(!checkDomain(part3)){
        errorPrint(1);
        email = reader.next();
        parseEmail(email);
      }
    }

    System.out.println("User Input: " + email + "\nUsername: " + part1 + "\nServer: " + part2 + "\nDomain: " + part3);
  }
}
