import java.util.Scanner;

class coke{

	public static void main (String[] argv){

	double nickel = 0.05;
	double dime = 0.10;
	double quarter = 0.25;
	int Sprite = 0;
	int Coke = 8;
	int Water = 8;
	double money = 0.00; 

	int i = 1;
	while (i < 2){
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Hello! Which Beverage would you like today? \n 1 = Sprite \n 2 = Coke \n 3 = Water		\n		>>>");
		int ans1 = scanner1.nextInt();

		if (ans1 <= 1){
			System.out.println("Sorry, we are out of Sprite. Please choose another option.");
	
		}else{
				System.out.println("Price = $1.00");
				
				for (double money = 0.00; money <= 1.00; money++){
					Scanner moneyScan = new Scanner(System.in);
					System.out.print("Insert Your First Coin: \n n = 0.05  \n d = 0.10  \n q = 0.25");
					double moneyIn = reader.nextDouble();

						if(moneyIn = n){
							double money1 == (money ++ nickel);
							money1 = money;
							System.out.println("Total money inserted: " + money);
						}else{
							
							if(moneyIn = d){
								double money2 == (money ++ dime);
								money2 = money;
								System.out.println("Total money inserted: " + money);
							}else{
								if(moneyIn = q){
									double money3 == (money ++ quarter);
									money3 = money;
									System.out.println("Total money inserted: " + money);
								}
							}		
				}//this ends the for loop
				
				System.out.println("Here is your beverage. Enjoy.");
				System.out.println("Your Change: ");
				
				int change = ((double)1.00 - money);
				System.out.print(change);
				
		} //ending big else
	} //ends while loop
} //ends coke class