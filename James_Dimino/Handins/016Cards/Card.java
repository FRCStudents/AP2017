public class Card{

	int number;
	String color;
	boolean side; //True = Card Is Face Side Up
	boolean joker;
	String suit;

	public int getNumber(){
		return number;
	}

	public void setNumber(int new_number){
		number = new_number;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String new_color){
		color = new_color;
	}

	public boolean getSide(){
		return side;
	}

	public void setSide(boolean new_side){
		side = new_side;
	}

	public boolean getJoker(){
		return joker;
	}

	public void setJoker(boolean new_joker){
		joker = new_joker;
	}

	public String getSuit(){
		return suit;
	}

	public void setSuit(String new_suit){
		suit = new_suit;
	}



}