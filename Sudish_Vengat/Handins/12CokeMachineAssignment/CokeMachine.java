import java.util.Scanner;

public class CokeMachine{

	double nickel = 0.05;
	double dime = 0.10;
	double quarter = 0.25;
	int sprite = 0;
	int coke = 5;
	int fanta = 4;
	double money;

	public void buySoda(){

		Scanner cokeChoice = new Scanner(System.in);
		System.out.println("Which coke do you want : \n 1 = Sprite \n 2 = Coke \n 3 = Fanta");
		int choice = cokeChoice.nextInt();

		if (choice <= 1){
			
			System.out.println("We are out of Sprite. Choose another option.");
			return;

		}else{
			System.out.println("Price = $1.00");

			Scanner ScanNickel = new Scanner(System.in);
			System.out.println("How many Nickles would you like to insert?");
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
						System.out.println("You have not yet inserted enough change");
						System.out.println("Your current total: $" + money);
						double fundsNeeded;
						fundsNeeded = (1.00 - money);
						System.out.println("You need to insert $" + fundsNeeded + " more.");
			
						Scanner ScanDime = new Scanner(System.in);
						System.out.println("How many Dimes would you like to insert?");
						int insertedDimes = ScanDime.nextInt();

						double money2; 
						money2 = (money + (insertedDimes*.10));

						if (money2 >= 1.00){
							System.out.println("Here is your " + choice + ".");
							double Dchange;
							Dchange = (money2 - 1.00);
							System.out.println("Here is your change: $" + Dchange);
							return;

						}else{
							System.out.println("You have not yet inserted enough change");
							System.out.println("Your current total: $" + money2);
							double moreFundsNeeded;
							moreFundsNeeded = (1.00 - money2);
							System.out.println("You need to insert $" + moreFundsNeeded + " more.");
			
							Scanner ScanQuarter = new Scanner(System.in);
							System.out.println("How many Quarters would you like to insert?");
							int insertedQuarters = ScanQuarter.nextInt();

							double money3;
							money3 = (money2 + (insertedQuarters*.25));

							if (money3 >= 1.00){
								System.out.println("Here is your " + choice + ".");
								double QChange;
								QChange = (money3 - 1.00);
								System.out.println("Here is your change: $" + QChange);
								return;

							}else{
						
								System.out.println("You dont have enough money");
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