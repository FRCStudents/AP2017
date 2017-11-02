/*
* @KyleRuhl Vending Machine assignment
*Assignment #12
*/
import java.util.Scanner;
public class vending{

	double nickel = 0.05;
	double dime = 0.10;
	double quarter = 0.25;
	int Sprite = 0;
	int Coke = 8;
	int Water = 8;
	double money = 0.00;

	public void buySoda(){

/*
*This is the function that does everything
*
*It lets the user choose what drink they want
*Then asks them for the coins to inseret
*Then returns the change.
*
*and if there isnt enough change it returns change and ends.
*
*/
		Scanner bevChoice = new Scanner(System.in);
		System.out.println("Hello! Which Beverage would you like today? Type in the number of your choice:  \n 1 = Sprite \n 2 = Coke \n 3 = Water");
		int choice = bevChoice.nextInt();

		if (choice <= 1){
			/*
			 *If they choose 1 (a sprite) then they will
			 *find out that there are no Sprite left
			*/
			System.out.println();
			System.out.println("Sorry, we are out of Sprite. Please choose another option.");
			return;

		}else{
			System.out.println("Price = $1.00");

			//This scanner is finding out how many nickels they want to insert

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

						/*
						 *This determines how many Dimes the person wants to insert
						 *continuing from the else statement above
						*/
						Scanner ScanDime = new Scanner(System.in);
						System.out.println("How many DIMES would you like to insert? (You must type in a whole number)");
						int insertedDimes = ScanDime.nextInt();

						double money2; //new money variable that uses old one from Nickel and the Dime input
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

							/*
							 *This determines how many Quarters the person wants to insert
							 *continuing from the else statement above
							*/
							Scanner ScanQuarter = new Scanner(System.in);
							System.out.println("How many QUARTERS would you like to insert? (You must type a whole number)");
							int insertedQuarters = ScanQuarter.nextInt();

							double money3; //new money variable that incorperates money 2 and instered QUARTERS
							money3 = (money2 + (insertedQuarters*.25));

							if (money3 >= 1.00){
								System.out.println();
								System.out.println("Here is your " + choice + ".");
								double QChange;
								QChange = (money3 - 1.00);
								System.out.println("Here is your change: $" + QChange);
								return;

							}else{
								/*
								*This prints out stuff
								*if they didn't insert at least $1.00
								*/
								System.out.println();
								System.out.println("You have failed to insert the proper change");
								System.out.println("Check the bottom slot for your change and try again.");
								double TChange;
								TChange = (money3 * 1);
										System.out.println("Returned Coinage amount: $" + TChange);
										return;
							}//ends else
						}//ends else above
					}//ends else above the above
				}//ends the biggest else
	}//ends BUYSODA function
}//ends class
