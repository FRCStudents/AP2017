import java.util.Scanner;
public class VendingMachine{

	double nickel = 0.05;
	double dime = 0.10;
	double quarter = 0.25;
	int Coke = 0;
	int Fanta = 8;
	int Sprite = 8;
	double money = 0.00;

	public void buySoda(){


		Scanner bevChoice = new Scanner(System.in);
		System.out.println("Welcome! Which Beverage would you like today? Type in the number of your choice:  \n 1 = Coke \n 2 = Fanta \n 3 = Sprite");
		int choice = bevChoice.nextInt();

		if (choice <= 1){
			
			System.out.println();
			System.out.println("Sorry, we are out of Coke. Please choose another option.");
			return;

		}else{
			System.out.println("Price = $1.00");


			Scanner ScanNickel = new Scanner(System.in);
			System.out.println("How many NICKLES would you like to insert? (You must type in a whole number)");
			int insertedNickels = ScanNickel.nextInt();

			money = (insertedNickels * .05);
			System.out.println("Your current total inserted: $" + money);
			System.out.println();

			if (money >= 1.00){
				System.out.println("Here is your " + choice + ".");
				double Nchange;
				Nchange = (money - 1.00);
				System.out.println("Here is your change: $" + Nchange);
				return;
					}else{
						System.out.println();
						System.out.println("You have not yet inserted enough change");
						System.out.println("Your current total: $" + money);
						System.out.println();
						double fundsNeeded;
						fundsNeeded = (1.00 - money);
						System.out.println("You need to insert $" + fundsNeeded + " more.");
						System.out.println();

						Scanner ScanDime = new Scanner(System.in);
						System.out.println("How many DIMES would you like to insert? (You must type in a whole number)");
						int insertedDimes = ScanDime.nextInt();

						double money2; 
						money2 = (money + (insertedDimes*.10));

						if (money2 >= 1.00){
							System.out.println();
							System.out.println("Here is your " + choice + ".");
							double Dchange;
							Dchange = (money2 - 1.00);
							System.out.println("Here is your change: $" + Dchange);
							return;

						}else{
							System.out.println();
							System.out.println("You have not yet inserted enough change");
							System.out.println("Your current total: $" + money2);
							double moreFundsNeeded;
							moreFundsNeeded = (1.00 - money2);
							System.out.println("You need to insert $" + moreFundsNeeded + " more.");
							System.out.println();

							Scanner ScanQuarter = new Scanner(System.in);
							System.out.println("How many QUARTERS would you like to insert? (You must type a whole number)");
							int insertedQuarters = ScanQuarter.nextInt();

							double money3; 
							money3 = (money2 + (insertedQuarters*.25));

							if (money3 >= 1.00){
								System.out.println();
								System.out.println("Here is your " + choice + ".");
								double QChange;
								QChange = (money3 - 1.00);
								System.out.println("Here is your change: $" + QChange);
								return;

							}else{
								System.out.println();
								System.out.println("You have failed to insert the proper change");
								System.out.println("Check the bottom slot for your change and try again.");
								double TChange;
								TChange = (money3 * 1);
										System.out.println("Returned Coinage amount: $" + TChange);
										return;
}
}
}
}
}
}				