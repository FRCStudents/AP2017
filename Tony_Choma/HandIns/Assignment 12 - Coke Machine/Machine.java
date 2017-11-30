import java.util.*;

public class Machine{
        int numDrinks = drinks.length();
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
                switch (numDrinks){
                        case 1: drinks = "Coca Cola";
                        case 2: drinks = "Sprite";
                        case 3: drinks = "Pepsi";
                        case 4: drinks = "Water";
                        case 5: drinks = "Fanta";
                }
                System.out.println(drinks);

        }

        public static void main(String[] args){
                Machine m = new Machine();
                m.userInput();
                m.checkInput();
        }
}
