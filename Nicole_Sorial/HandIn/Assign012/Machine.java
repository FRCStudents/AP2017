import java.util.*;

class Machine {

	// Attributes
	Drink d1 = new Drink("Coca-Cola", 2.50, 5);
	Drink d2 = new Drink("Sprite", 2.50, 5);
	Drink d3 = new Drink("Lemonade", 1.50, 5);
	String currentDrinkCode; // will allow for input in acceptDrink()
	Drink currentDrink; // used to identify drink, price, and inventory based on user choice
	double currentInput = 0; // assigned to cent value after coin is inserted
	double currentPrice = 0; // updates as coins are inserted
	String goOn = "Yes"; // continues the program until user does not want to buy more
	String currentMoneyType; // allows user input for coins
	String quarter = "q"; // not chars so that they can be compared
	String dime = "d";
	String nickel = "n";
	Scanner s = new Scanner(System.in);

	// Methods
	public void displayOptions() { // will not display option if there are no more
		System.out.println("Welcome to the Coke Machine!");
		System.out.println("We have:");
		if (d1.inventory > 0) {
			System.out.println(d1.name);
		}
		if (d2.inventory > 0) {
			System.out.println(d2.name);
		}
		if (d3.inventory > 0) {
			System.out.println(d3.name);
		}
	}

	public void acceptDrink() { // lets user choose a drink then uses determineDrink()
		if (d1.inventory > 0) {
			System.out.println("To buy " + d1.name + ", please enter d1");
		}
		if (d2.inventory > 0) {
			System.out.println("To buy " + d2.name + ", please enter d2");
		}
		if (d3.inventory > 0) {
			System.out.println("To buy " + d3.name + ", please enter d3");
		}
		currentDrinkCode = s.next();
		determineDrink();
	}

	public void determineDrink() { // sets currentDrink and currentPrice based on user input
		if (d1.inventory > 0 && currentDrinkCode.equals("d1")) {
			currentDrink = d1;
			currentPrice = d1.price;
		} else if (d2.inventory > 0 && currentDrinkCode.equals("d2")) {
			currentDrink = d2;
			currentPrice = d2.price;
		} else if (d3.inventory > 0 && currentDrinkCode.equals("d3")) {
			currentDrink = d3;
			currentPrice = d3.price;
		} else {
			System.out.println("Not an option.");
			acceptDrink();
		}
	}

	public void acceptMoney() { // allows user input for money
		System.out.println("Please enter $" + currentPrice);
		System.out.println("To enter a quarter, enter \"q\"");
		System.out.println("To enter a dime, enter \"d\"");
		System.out.println("To enter a nickel, enter \"n\"");
		System.out.println("When finished, enter \"done\"");
		currentMoneyType = s.next();
		addMoney();
	}

	public void addMoney() { // subtracts inputted money from current price
		String a = "Yes";
		for (String x = a; x.equals("Yes"); x = a) { // accepts money until done
			if (currentMoneyType.equals(quarter)) {
				currentInput = 0.25;
				currentPrice = currentPrice - currentInput;
				acceptMoney();
			} else if (currentMoneyType.equals(dime)) {
				currentInput = 0.10;
				currentPrice = currentPrice - currentInput;
				acceptMoney();
			} else if (currentMoneyType.equals(nickel)) {
				currentInput = 0.05;
				currentPrice = currentPrice - currentInput;
				acceptMoney();
			} else if (currentMoneyType.equals("done")) {
				a = "No"; // stops the loop of accepting money
			} else {
				System.out.println("Not a valid input");
				acceptMoney();
			}
		}
	}

	public void determineMoney() { // checks if enough money has been entered
		if (currentPrice != 0 && currentPrice > 0) {
			System.out.println("You have not entered enough money.");
			acceptMoney();
		}
		if (currentPrice == 0) {
			System.out.println("Here is your drink!");
			System.out.println(currentDrink.name);
			currentDrink.inventory = currentDrink.inventory - 1;
		}
		if (currentPrice < 0) { // gives change if necessary
			System.out.println("Here is your drink!");
			System.out.println(currentDrink.name);
			currentDrink.inventory = currentDrink.inventory - 1;
			System.out.println("And here is your change!");
			System.out.println(-currentPrice);
		}
	}

	public String additionalDrinks() {
		System.out.println("Would you like to buy more drinks? Yes/No");
		goOn = s.next();
		return goOn;
	}

	public void yesOrNo(String additionalQuestions) { // decides whether to keep running driver or not
		if (additionalQuestions.equals("Yes")) {
			goOn = "Yes";
		}
		if (additionalQuestions.equals("No")) {
			goOn = "No";
			System.out.println("Thank you, goodbye!");
		}
		if (!additionalQuestions.equals("Yes") && !additionalQuestions.equals("No")) {
			System.out.println("Please respond with Yes or No");
			yesOrNo(additionalDrinks());
		}
	}


}