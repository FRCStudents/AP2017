import java.util.*;

class Machine {
    final int DRINK_COUNT = 3;
    private Drink[] contents = new Drink[DRINK_COUNT];
    private double moneyInserted = 0.0;

    public Machine() {
        for (int i = 0; i < DRINK_COUNT; i++){
            contents[i] = new Drink();
        }
    }

    public double getMoneyInserted() {
        return moneyInserted;
    }

    public void setDrinks() {
        for (int i = 0; i < DRINK_COUNT; i++){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Drink #" + (i + 1) + "'s name:");
            contents[i].setName(s.nextLine());
            System.out.println("Enter " + contents[i].getName() + "'s cost:");
            contents[i].setCost(s.nextDouble());
            System.out.println("Enter the amount of " + contents[i].getName() + " in the machine:");
            contents[i].setNum(s.nextInt());
        }
    }

    public void listProducts() {
        for (int i = 0; i < DRINK_COUNT; i++) {
            System.out.println("\t" + contents[i].getName());
            System.out.println("\t\tCost: " + contents[i].getCost());
            System.out.println("\t\tAmount Left: " + contents[i].getNum());
        }
    }

    public void addCoins() {

    }

    public void buyProduct() {
        
    }

    public void promptCommand() {
        System.out.println("\t|------------------------|");
        System.out.println("\t|     WELCOME TO THE     |");
        System.out.println("\t|     VENDOTRON 5000     |");
        System.out.println("\t|------------------------|");
        System.out.println("\t|   1) List Products     |");
        System.out.println("\t|   2) Add Coins         |");
        System.out.println("\t|   3) Show Money Added  |");
        System.out.println("\t|   4) Buy Product       |");
        System.out.println("\t|------------------------|");
        parseCommand();
    }

    public void parseCommand() {
        Scanner s = new Scanner(System.in);
        System.out.println(">>> ");
        int result = s.nextInt();

        if (result == 1) {
            listProducts();
        } else if (result == 2) {
            addCoins();
        } else if (result == 3) {
            System.out.println("You have inserted $" + getMoneyInserted());
            promptCommand();
        } else if (result == 4) {
            buyProduct();
        } else {
            System.out.println("Command number not recognized. Please type just the number of the command.\n");
            parseCommand();
        }
    }
}