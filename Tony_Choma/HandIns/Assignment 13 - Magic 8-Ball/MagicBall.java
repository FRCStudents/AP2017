import java.util.*;

public class MagicBall{
        String[] values = {"Concentrate and Ask Again",
                        "Don't Count On It",
                        "It is Certain",
                        "Most Likely",
                        "My Reply is No",
                        "My Sources Say No",
                        "No",
                        "Outlook Good",
                        "Yes, Definitely",
                        "You May Rely On It"
                };
        public String userInput(){
                Scanner userInput = new Scanner(System.in);
                System.out.println("What would you like to ask the magic 8-Ball? ");
                String x = userInput.nextLine();
                return x;
        }
        public void randomResponse(){
                Random rand = new Random();
                int random = rand.nextInt(10);
                System.out.println(values[random]);

        }
        public static void main(String[] args){
                MagicBall m = new MagicBall();
                m.userInput();
                m.randomResponse();
        }
}
