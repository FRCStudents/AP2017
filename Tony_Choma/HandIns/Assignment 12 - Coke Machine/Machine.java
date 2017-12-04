import java.util.*;

public class Machine{
        String[] drinks = new String[]{"1.Coca Cola", "2.Sprite", "3.Pepsi", "4.Water", "5.Fanta"};
        int numDrinks = drinks.length;
        int[] amounts = new int[]{3,5,2,1,0};
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
                for(int x = 0; x < drinks.length-1;x++){
                        if(amounts[x] == 0){
                                System.out.println("Opps! There's no more!");
                        }else{
                                System.out.println("Here you go!");
                        }
                }
        }
        public static void main(String[] args){
                Machine m = new Machine();
                m.userInput();
                m.checkInput();
        }
}
