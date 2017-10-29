
import java.util.*;

class Machine {
	Stock[] stockArray = new Stock[25];
	int numDrinks = 0;
	Money money = new Money();

	public Machine(){
		setNumDrinks(0);
	}

	public void addStock(Drink d){
		for(int i=0; i < numDrinks; i++){
			if(stockArray[i].sameDrink(d)){
				stockArray[i].addDrink();
			}
		}
	}

	public void addDrink(Drink d){
		boolean added = false;

		for(int i=0; i < numDrinks; i++){
			if(stockArray[i].sameDrink(d)){
				addStock(d);
				added = true;
			}
		}
		if(!added){
			stockArray[numDrinks] = new Stock(d, 1);
			numDrinks++;
		}
	}

	public void setNumDrinks(int n){
		numDrinks = n;
	}

	public void loadMachine(){
		Drink d = new Drink("Coke", 132);
		addDrink(d);
		d = new Drink("Sprite", 123);
		addDrink(d);
		d = new Drink("Pepsi", 99);
		addDrink(d);
		d = new Drink("Dr Pepper", 149);
		addDrink(d);
	}

	public int getMoney(){
		Scanner s = new Scanner(System.in);

		System.out.println("Quarters: ");
		int response = s.nextInt();
		money.setQuarters(response);
		System.out.println("Dimes: ");
		response = s.nextInt();
    money.setDimes(response);
    System.out.println("Nickles: ");
    response = s.nextInt();
    money.setNickles(response);
    System.out.println("Pennies: ");
    response = s.nextInt();
		money.setPennies(response);
		return money.addCoins();
	}


	public int giveChange(Stock s, int payment){
		return payment - s.getDrink().getPrice();
	}


	public void runUserInterface(){
	  Scanner s = new Scanner(System.in);
		int choice;
		int payment;

		System.out.println("Would you like a drink? (y/n) ");
		String response = s.next();
		while(response.toLowerCase().indexOf("y") > -1){
			showMachine();
			System.out.println("Please choose a drink... ");
			choice = s.nextInt();

			if(!stockArray[choice - 1].drinkInStock()){
					System.out.println("Sorry, we don't have anymore " + stockArray[choice - 1].getDrink().getName());
					System.out.println("Would you still like a drink? (y/n) ");
					response = s.next();
					continue;
				}

			payment = getMoney();
			if(payment >= stockArray[choice - 1].getDrink().getPrice()){
				stockArray[choice - 1].diminish();
				System.out.println("Change: " + giveChange(stockArray[choice - 1], payment));
			}
			else {
				System.out.println("That is not enough money!");
			}
			System.out.println("Would you like a drink?");
			response = s.next();
			}
	}

	public void showMachine(){
		for(int i=0; i < numDrinks; i++){
			stockArray[i].showStock(i + 1);
		}
	}
}
