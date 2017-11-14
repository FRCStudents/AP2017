public class Card{

private	int Number;
private	String Suit;
private	int Rank;

public Card(){
	int Number = 2;
	String Suit = "none";
	int Rank = 1;
}

//setters and getters
public int getNumber(){
	return Number;
}
public void setNumber(int Number){
	Number = currentNumber;
}
public String getSuit(){
	return Suit;
}
public void setSuit(String Suit){
	Suit = currentSuit;
}

public int getRank(){
	return Rank;
}
public void setRank(int Rank){
	Rank = currentRank;
}



public void displaySuit(int Suit){
	return currentSuit;
}

public boolean isEqual(int Number){
	return getNumber() == Number;
}
public void printCard(){
	return Card;
}
public boolean ishigher(int Rank){
	return getRank() > Rank;
}

public String toString(){
	return "Card" + " " + "Suit:" + " " + Suit + " " + "Number:" + " " + Number + " " + "Rank:" + " " + Rank;
}
}