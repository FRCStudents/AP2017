import java.util.*;

// first num row
// second num column
// array[row][column]   <-- for normal arrays
// 

class Inventory {
    public static void main(String[] args) {
        ArrayList<ArrayList<Product>> inv = new ArrayList<ArrayList<Product>>();

        inv.add(new Product("Coffeecup", "White", 3.25, 4));
        inv.add(new Product("Coffeecup", "Black", 3.25, 4));

        System.out.println("The ArrayList is: " + inv + " and has this many spaces: " + inv.size());
        System.out.println();
        System.out.println(inv.get(0));
        System.out.println(inv.get(1));
    }
}