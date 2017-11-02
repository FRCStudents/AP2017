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
		
		Scanner bevChoice = new Scanner(System.in);
		System.out.println("Hello! Which Beverage would you like today? Type in the number of your choice:  \n 1 = Sprite \n 2 = Coke \n 3 = Water");
		int choice = bevChoice.nextInt();
		
		if (ans1 <= 1){
			System.out.println("Sorry, we are out of Sprite. Please choose another option.");
			return;
	
		}else{
			System.out.println("Price for a " + choice + " = $1.00");
			
			//Searching for Nickles
			
			Scanner ScanNickel = new Scanner(System.in);
			System.out.println("How many NICKLES would you like to insert? (You must type in a whole number)");
			int insertedNickels = ScanNickel;
			
			money = (insertedNickles*.05);
			System.out.println("Your current total inserted: $" + money);
		
			if (money >= 1.00){
				System.out.println("Here is your " + choice + ".");
				double Nchange;
				NChange = (money - 1.00);
				System.out.println("Here is your change: $" + NChange);
				return;
					}else{
						System.out.println("You have not yet inserted enough change");
						System.out.println("Your current total: $" + money);
						double fundsNeeded;
						fundsNeeded = (1.00 - money);
						System.out.println("You need to insert $" + fundsNeeded + " more.");
						
						Scanner ScanDime = new Scanner(System.in);
						System.out.println("How many DIMES would you like to insert? (You must type in a whole number)");
						int insertedDimes = ScanDime;
						
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
							System.out.println("How many QUARTERS would you like to insert? (You must type a whole number)");
							int insertedQuarters = ScanQuarter;
							
							double money3;
							money3 = (money2 + (insertedQuarters*.25));
	
							if (money3 >= 1.00){
								System.out.println("Here is your " + choice + ".");
								double QChange;
								QChange = (money3 - 1.00);
								System.out.println("Here is your change: $" + QChange);
								return;
								
									}else{
										System.out.println("You have failed to insert the proper change");
										System.out.println("Check the bottom slot for your change and try again.");
										double TChange;
										TChange = (money3 * 1);
										System.out.println("Returned Coinage amount: $" + TChange);
										return;
									}//ends else
						}			return;
	}
	return;	
}