import java.util.*;

public class Machine{
        String[] drinks = new String[]{"Coca Cola", "Sprite", "Pepsi", "Water", "Fanta"};
        private String x;

        public void returnTypes(){
                for (int i = 0; i < drinks.length; i++){
                        System.out.println(drinks[i]);
                }
        }

        public String userInput(){
                Scanner s = new Scanner(System.in);
                System.out.println("What would you like to drink? ");
                returnTypes();
                x = s.nextLine();
                return x;
        }

        public static void main(String[] args){
                Machine m = new Machine();
                m.userInput();

        }
}
