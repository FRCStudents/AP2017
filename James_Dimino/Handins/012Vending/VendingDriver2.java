import java.util.Scanner;

class VendingDriver2{
	public static void main(String[] argv){

	int coke = 3;
	int pepsi = 3;
	int sprite = 3;
	double costCoke = 1.00;
	double costPepsi = 1.05;
	double costSprite = 0.95;
	double insertedMoney = 0.00;
	int d = 0;
	int repeat = 0;

	for(int b = 0; b <= 80; b++){
        System.out.print("\n");
    }

	while (repeat == 0){
		VendingMachine2 v = new VendingMachine2(coke, pepsi, sprite);
		System.out.print(v);

			Scanner scanner1 = new Scanner(System.in);
			System.out.println("\n What Would You Like To Buy? \n\n 1 -> Coke = $1.00 \n 2 -> Pepsi = $1.05 \n 3 -> Sprite = $.95");
			int purchase = scanner1.nextInt();	

			if (purchase == 1){
				if (coke > 0){
					System.out.println("That Costs: $" + costCoke + "\n");
				} if (coke == 0){
					System.out.println("Coke Out Of Stock!");
					System.out.println("Have A Good Day!");
					System.out.println("\nReturning Change...");
					System.out.println("\nChange: $" + insertedMoney);
					break;
				}
			} if (purchase == 2){
				if (pepsi > 0){
					System.out.println("That Costs: $" + costPepsi + "\n");
				} if (pepsi == 0){
					System.out.println("Pepsi Out Of Stock!");
					System.out.println("Have A Good Day!");
					System.out.println("\nReturning Change...");
					System.out.println("\nChange: $" + insertedMoney);
					break;
				}
			} if (purchase == 3){
				if (sprite > 0){
					System.out.println("That Costs: $" + costSprite + "\n");
				} if (sprite < 0){
					System.out.println("Sprite Out Of Stock!");
					System.out.println("Have A Good Day!");
					System.out.println("\nReturning Change...");
					System.out.println("\nChange: $" + insertedMoney);
					break;
				}
			} if (!(purchase == 1 || purchase == 2 || purchase == 3)){
					System.out.println("That Is Not A Valid Option! \n");
					System.out.println("Have A Good Day!");
					System.out.println("\nReturning Change...");
					System.out.println("\nChange: $" + insertedMoney);
					break;
			}

			for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        	}

				System.out.println("Time To Pay! \n");

			for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        	}

// User Inserts Quarters
        		System.out.println("Funds: $" + insertedMoney);
				
				while (d == 0){
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Press 0 -> Insert Quarter \nPress 1 -> Done Inserting Quarters");
					int doneQuarter = scanner2.nextInt();

				if (doneQuarter == 1){
					for(int b = 0; b <= 80; b++){
            		System.out.print("\n");
        			}
        			System.out.println("Funds: $" + insertedMoney);
					d++;
				} if (doneQuarter == 0){
					insertedMoney = insertedMoney + 0.25;
						for(int b = 0; b <= 80; b++){
            			System.out.print("\n");
        				}
					System.out.println("Funds: $" + insertedMoney);
				}
				
				}

				d--;

// User Inserts Dimes

				while (d == 0){
					Scanner scanner3 = new Scanner(System.in);
					System.out.println("Press 0 -> Insert Dime \nPress 1 -> Done Inserting Dimes");
					int doneDime = scanner3.nextInt();
					System.out.println("Funds: $" + insertedMoney);
				if (doneDime == 1){
					for(int b = 0; b <= 80; b++){
            		System.out.print("\n");
       				}
       				System.out.println("Funds: $" + insertedMoney);
					d++;
				} if (doneDime == 0){
					insertedMoney = insertedMoney + 0.10;
						for(int b = 0; b <= 80; b++){
            			System.out.print("\n");
        				}
					System.out.println("Funds: $" + insertedMoney);
				}
				
				}

				d--;

// User Inserts Nickels
		
				while (d == 0){
					Scanner scanner4 = new Scanner(System.in);
					System.out.println("Press 0 -> Insert Nickle \nPress 1 -> Done Inserting Nickles");
					int doneNickle = scanner4.nextInt();

				if (doneNickle == 1){
					for(int b = 0; b <= 80; b++){
            		System.out.print("\n");
        			}

					d++;
				} if (doneNickle == 0){
					insertedMoney = insertedMoney + 0.05;
					for(int b = 0; b <= 80; b++){
           			System.out.print("\n");
        			}
					System.out.println("Funds: $" + insertedMoney);
				}
				
				}

				d--;

//Program Decides What To Do With Inserted Money
			if (purchase == 1){
				if (insertedMoney < costCoke){
					System.out.println("Insufficient Funds");
					System.out.println("Returning Change...");
					System.out.println("Here's Your Change: " + insertedMoney);
					insertedMoney = insertedMoney - insertedMoney;
				} if (insertedMoney >= costCoke){
					System.out.println("Enjoy Your Drink!");
					coke = coke - 1;
					insertedMoney = insertedMoney - costCoke;
					System.out.println("\nRemaining Funds: $" + insertedMoney);
				}
			}	

			if (purchase == 2){
				if (insertedMoney < costPepsi){
					System.out.println("Insufficient Funds");
					System.out.println("Returning Change...");
					System.out.println("Here's Your Change: " + insertedMoney);
					insertedMoney = insertedMoney - insertedMoney;
				} if (insertedMoney >= costPepsi){
					System.out.println("Enjoy Your Drink!");
					pepsi = pepsi - 1;
					insertedMoney = insertedMoney - costPepsi;
					System.out.println("\nRemaining Funds: $" + insertedMoney);
				}
			}	

			if (purchase == 3){
				if (insertedMoney < costSprite){
					System.out.println("Insufficient Funds");
					System.out.println("Returning Change...");
					System.out.println("Here's Your Change: " + insertedMoney);
					insertedMoney = insertedMoney - insertedMoney;
				} if (insertedMoney >= costSprite){
					System.out.println("Enjoy Your Drink!");
					sprite = sprite - 1;
					insertedMoney = insertedMoney - costSprite;
					System.out.println("\nRemaining Funds: $" + insertedMoney);
				}
			}

//User Imputs If They Want To Buy More or Stop Buying
//Programs Returns Any Left Over Change (If Their Is Any)
			Scanner scanner14 = new Scanner(System.in);
			System.out.println("\nPress 0 -> Purchase More \nPress 1 -> Stop Buying");
			int decide = scanner14.nextInt();

			if (decide == 0){
				System.out.println("\nReturning To Home Screen \n");
			} else {
				for(int b = 0; b <= 80; b++){
           		System.out.print("\n");
        		}
				System.out.println("\nReturning Change...");
				System.out.println("\nChange: $" + insertedMoney + "\n");
				repeat++;
			}

		}



		}
}
