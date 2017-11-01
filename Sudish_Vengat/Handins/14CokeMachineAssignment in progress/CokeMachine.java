public class CokeMachine {

private double quarter = 0.25;
private double dime = 0.10;
private double nickel = 0.5;
private double money_count;
private double coke_price;
private int coke_count;
private int sprite;
private int coke;
private int fanta;


	moneyForCokeMachine(int m, int p){
		money_count = m;
		coke_price = p;

		if(m >= p){
			return "You can buy Coke!";
		} else {
			return "You're too broke!";
		}
	}

	purchasingSprite(int c, int s){
		coke_count = c;
		sprite = s;

		if(c == 2 && s == 0){
			return "Sorry there are no Sprites available!";
		} else {
			return "I suppose you can buy some Sprite!";
		}
	}

}