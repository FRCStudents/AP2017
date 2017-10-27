import java.util.Scanner;

class VendingMachine2{

		int nickel = 5;
		int dime = 10;
		int quarter = 25;
		int coke;
		int pepsi;
		int sprite;
		double costCoke = 1.00;
		double costPepsi = 1.05;
		double costSprite = 0.95;
		double insertedAmount;

			VendingMachine2(int amountOfCoke, int amountOfPepsi, int amountOfSprite){
				coke = amountOfCoke;
				pepsi = amountOfPepsi;
				sprite = amountOfSprite;
			}

			public String toString(){
				return "\n Coke: " + coke + "\n Pepsi: " + pepsi + "\n Sprite: " + sprite + "\n";
			}

}