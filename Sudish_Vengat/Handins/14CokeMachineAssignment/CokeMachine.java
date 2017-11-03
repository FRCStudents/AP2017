import java.util.*;

public class CokeMachine {

private double quarter = 0.25;
private double dime = 0.10;
private double nickel = 0.5;
private double money_count;
private double coke_cost;
private int coke_count;
private String coke_name;
private int sprite;


public void Sprite(){

	coke_name = "Sprite";
	coke_cost = 1.25;
	coke_count = 0;
}

public void Fanta(){

	coke_name = "Fanta";
	coke_cost = 1.00;
	coke_count = 3;
}

public void Pepsi(){

	coke_name = "Pepsi";
	coke_cost = 1.20;
	coke_count = 2;
}

public String  moneyForCokeMachine(int m, int p){
		money_count = m;
		coke_cost = p;
		
		if(m >= p){
			return "You can buy Coke!";
		} else {
			return "You're too broke!";
		}
	}

public String purchasingSprite(int c, int s){
		coke_count = c;
		sprite = s;

		if(c == 2 && s == 0){
			return "Sorry there are no Sprites available!";
		} else {
			return "I suppose you can buy some Sprite!";
		}
	}
}