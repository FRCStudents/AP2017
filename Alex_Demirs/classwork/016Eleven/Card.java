public class Card{

private	int Number;
private	String Suit;
private	int Rank;
private Boolean Value;
//constructor (modified)
public Card(String s, int n, int r) {
        Suit = s;
        Number = n;
        Rank = r;
    }
    public Card() {
        Suit = "Hearts";
        Number = 5;
        Rank = 5;
    }

//setters and getters
public int getNumber(){
	return Number;
}
public void setNumber(int currentNumber){
	Number = currentNumber;
}
public String getSuit(){
	return Suit;
}
public void setSuit(String currentSuit){
	Suit = currentSuit;
}

public int getRank(){
	return Rank;
}
public void setRank(int currentRank){
	Rank = currentRank;
}

public boolean getValue(){
	return Value;
}

public void setValue(boolean currentValue){
	Value = currentValue;
}

public char displaySuit(String c) {
              switch (c) {
                  case "Spades":
                      return ((char)'S');
                  case "Diamonds":
                      return ((char)'D');
                  case "Clubs":
                      return ((char)'C');
                  case "Hearts":
                      return ((char)'H');
              }
              return ' ';
      }


	public boolean isEqual(Card c){
		if (c.getSuit() == Suit){
			boolean a = true;
		}boolean a = false;
		
		if (c.getNumber() == Number){
			 boolean b = true;
		}boolean b = false;

		if (a && b){
			return true;
		}return false;
	}

public void printCard(){
	System.out.println("Suit" + " " + displaySuit(Suit) + " " + Suit);
	System.out.println("Rank" + " " + Rank);
	System.out.println("Number" + " " + Number);

}
	public boolean isHigher(Card c){
		if (c.getRank()==Rank){
			return true;
		}return false;
	}

public String toString(){
	return "Card" + " " + "Suit:" + " " + Suit + " " + "Number:" + " " + Number + " " + "Rank:" + " " + Rank;
}
}
