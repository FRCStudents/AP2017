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
            System.out.println("\t" + (i + 1) + ": "+ contents[i].getName());
            System.out.println("\t\tCost: " + contents[i].getCost());
            System.out.println("\t\tAmount Left: " + contents[i].getNum());
        }
    }

    public void addCoins() {
        Scanner s = new Scanner(System.in);
        System.out.println(">>> ");
        String result = s.next();

        if (result.equals("nickel")) {
            moneyInserted += 0.05;
        } else if (result.equals("dime")) {
            moneyInserted += 0.1;
        } else if (result.equals("quarter")) {
            moneyInserted += 0.25;
        } else if (result.equals("dollar")) {
            moneyInserted += 1.0;
        } else {
            System.out.println("Please enter a valid coin name from the above choices.");
            addCoins();
        }

        System.out.println("You have added $" + getMoneyInserted() + ". Want to add more coins? (Please type 'y' or 'n')");
        Scanner a = new Scanner(System.in);
        System.out.println(">>> ");
        String aResult = s.next();

        if (aResult.equals("y")) {
            addCoins();
        } else {
            promptCommand();
        }
    }

    public void buyProduct() {
        listProducts();
        System.out.println("Enter the number of the drink to buy. If you do not wish to buy one, enter '0'");
        Scanner s = new Scanner(System.in);
        System.out.println(">>> ");
        int result = s.nextInt();

        if ((result > 0) && (result <= DRINK_COUNT)) {
            if ((getMoneyInserted() > contents[result - 1].getCost()) && (contents[result - 1].getNum() > 0)) {
                System.out.println("You bought a can of " + contents[result - 1].getName() + "!");
                contents[result - 1].decrement();
                moneyInserted -= contents[result - 1].getCost();
                System.out.println("You now have $" + getMoneyInserted() + " left in the machine.");
            } else {
                System.out.println("The machine is either out of " + contents[result - 1].getName() + ", or you don't have enough money deposited.");
            }
        }
        promptCommand();
    }

    public void changeAndExit() {

        System.out.println("Your change is $" + getMoneyInserted() +". Thanks for using the VENDOTRON 5000!");

        System.exit(0);
    }

    public void promptCommand() {
        System.out.println("\n\t|------------------------|");
        System.out.println("\t|     WELCOME TO THE     |");
        System.out.println("\t|     VENDOTRON 5000     |");
        System.out.println("\t|------------------------|");
        System.out.println("\t|   1) List Products     |");
        System.out.println("\t|   2) Add Coins         |");
        System.out.println("\t|   3) Show Money Added  |");
        System.out.println("\t|   4) Buy Product       |");
        System.out.println("\t|   5) Exit and Dispense |");
        System.out.println("\t|      Change            |");
        System.out.println("\t|------------------------|");
        parseCommand();
    }

    public void parseCommand() {
        Scanner s = new Scanner(System.in);
        System.out.println(">>> ");
        int result = s.nextInt();

        if (result == 1) {
            listProducts();
            promptCommand();
        } else if (result == 2) {
            System.out.println("The coins you can add are: \n\t'nickel' - $0.05\n\t'dime' - $0.10\n\t'quarter' - $0.25\n\t'dollar' - $1.00");
            addCoins();
        } else if (result == 3) {
            System.out.println("You have inserted $" + getMoneyInserted() + "\n");
            promptCommand();
        } else if (result == 4) {
            buyProduct();
        } else if (result == 5) {
            changeAndExit();
        } else {
            System.out.println("Command number not recognized. Please type just the number of the command.\n");
            parseCommand();
        }
    }
}