import java.util.*;

public class Machine{
//Array of Strings that hold the types of drinks the machine holds
        String[] drinks = new String[]{"Coca Cola", "Sprite", "Pepsi", "Water", "Fanta"};
//Some important random object
        public String input;
//returns the array of drinks for the user to see waht is in the machine
        public void returnTypes(){
                for (int i = 0; i < drinks.length; i++){
                        System.out.println(drinks[i]);
                }
        }
//User is asked what drink they want and they input into the console
        public String userInput(){
                Scanner s = new Scanner(System.in);
                System.out.println("What would you like to drink from of the list below? ");
                returnTypes();
                input = s.nextLine();
                return input;
        }
//Checks if the user input is the same as the drinks in the machine. If not, it'll return the user back to the beginning to try again
        public void checkInput(){
                //System.out.println("BUG");
                //BUG: For loop only goes to one value and then stops it and returns the "false" statement because input is not equal to drinks[1]
                for(int x = 0; x < drinks.length; x++){
                        if(input.equals(drinks[x])){
                                System.out.println("Ok, here you go.");

                        }
                        System.out.println("Oops! Wrong input for a drink. Please try again.");
                        
                }

        }
//}
        public static void main(String[] args){
                Machine m = new Machine();
                m.userInput();
                m.checkInput();
        }
}
