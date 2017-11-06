import java.util.*;

public class Machine{
        String[] drinks = new String[]{"Coca Cola", "Sprite", "Pepsi", "Water", "Fanta"};
        private String input;

        public void returnTypes(){
                for (int i = 0; i < drinks.length; i++){
                        System.out.println(drinks[i]);
                }
        }

        public String userInput(){
                Scanner s = new Scanner(System.in);
                System.out.println("What would you like to drink? ");
                returnTypes();
                input = s.nextLine();
                return input;
        }

        public boolean checkInput(){
                for(int x = 0; x < drinks.length; x++){
                        if(input == drinks[x]){
                                return true;
                        }
                }
                return false;
        }

        public static void main(String[] args){
                Machine m = new Machine();
                m.userInput();
                System.out.println(m.input);
                m.checkInput();
        }
}
