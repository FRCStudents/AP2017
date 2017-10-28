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


  public static void clearScreen() {
      System.out.flush();
  }


  public static void start(){
    clearScreen();
    askQuestion();
    System.out.print(run8BallOne());
    wait(500);
    System.out.print(response(shakeBall()) + "\n\n\n\n");
    wait(1500);
  }

  public static void keepGoing(){
    Scanner again = new Scanner(System.in);
    System.out.print("Would you like to ask another question? y/n \n         >");
    char answer = (char)again.next().tolowercase().charAt(0);
    if(answer == 'y') {
      wait(200);
      start();
    } else 
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
            }
        wait(800);
        clearScreen();
        System.exit(0);
        } else {
            System.out.println("\n\n\n        MISTAKES WERE MADE... Please answer with 'y' or 'n'...  \n\n\n\n");
            keepGoing();
        }
  }

  public static void main(String[] args) {
    start();
    keepGoing();
  }
}
