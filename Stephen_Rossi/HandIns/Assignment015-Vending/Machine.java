import java.util.*;
public class Machine{

  public static void main(String[] args){
    HashMap<String, Integer> drinks = new HashMap<String, Integer>();
    drinks.put("Coke", 5);
    drinks.put("Sprite", 1);
    drinks.put("Diet Coke", 0);
    drinks.put("Cherry Coke", 2);
    System.out.println("\n\n\n\n\n  +------------+\n  | DRINK MENU |\n  +------------+ \n\n");

    for ( String drink : drinks.keySet()) {
      if (drinks.get(drink) == 0){
        System.out.println(drink + ": SOLD OUT ");
      }   else {
        System.out.println(drink + " : " + drinks.get(drink) + " left");
      }
    }
    System.out.println("\n\n\n\n\n\n");
  }
}
