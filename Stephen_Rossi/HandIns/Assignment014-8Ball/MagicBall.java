import java.util.*;

public class MagicBall {
  private static String[] responses = {"Concentrate and Ask Again",
                                        "Don't Count On It",
                                        "It IS Certain",
                                        "Most Likely",
                                        "My Reply is No",
                                        "My Sources Say No",
                                        "No",
                                        "Outlook Good",
                                        "Yes, Definitely",
                                        "You May Rely On It"
        	};

  private static String lastQuestion;

  public static void setLastQuestion(String q){
      lastQuestion = q;
  }

  public static String getLastQuestion(){
    return lastQuestion;
  }

  public static int shakeBall(){
    return (int)Math.ceil(Math.random() * 9);
  }

  public static String response(int value){
    String x = responses[value];
    return x;
  }

  public static void askQuestion() {
    Scanner q = new Scanner(System.in);
    System.out.print("What yes or no question would you like to ask the mystical ball of 8... \n >>> ");
    String question = q.nextLine();
    setLastQuestion(question);
  }

  public static String run8BallOne(){
    return "The answer to your question of... '" + lastQuestion + "' is: \n     >> ";
  }

  public static void wait(int value){
          try{
              Thread.sleep(value);
          }
          catch(InterruptedException ex) {
              Thread.currentThread().interrupt();
          }
  }


  /*
   * one problem - you looked up the answer... but only used 1/2!
   * And the wrong half! lol!
   */


  public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
  }


  public static void start(){
    askQuestion();
    System.out.print(run8BallOne());
    wait(500);
    System.out.print(response(shakeBall()) + "\n\n\n\n");
    wait(1500);
    keepGoing();
  }

  /*
   * this is not a great use of recursion... in this case
   * it would be much better technique to write a normal
   * loop...
   *
   * but great effort!
   *
   * Also - if you keep your code consistently indented etc, you
   * find the logic errors easier - I added {}'s to your else statement
   * below...
   */
  public static void keepGoing(){
    Scanner again = new Scanner(System.in);
    System.out.print("Would you like to ask another question? y/n \n         >");
    char answer = (char)again.next().toLowerCase().charAt(0);
    if(answer == 'y') {
      wait(200);
      start();
      keepGoing();
    } else { // here is my first {
        if(answer == 'n'){
            System.out.print("\n\n\n\n     Have a nice day");
            for(int i = 0; i < 3; i++){
                wait(500);
                System.out.print(".");
            }
            System.out.print(" but remember what you were told.");
            for(int i = 0; i < 4; i++){
                wait(700);
                System.out.print(".");
            } // otherwise the else stops here... and it doesn't work the way you want.
        wait(800);
        clearScreen();
        return;
        //System.exit(0);
        } else {
            System.out.println("\n\n\n        MISTAKES WERE MADE... Please answer with 'y' or 'n'...  \n\n\n\n");
            keepGoing();
        }
    } // and my closing }
  }

  public static void main(String[] args) {
    clearScreen();
    start();
  }
}
