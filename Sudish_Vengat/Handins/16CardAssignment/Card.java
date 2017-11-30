public class Card {

//attributes
	int number;
	String suit;
	int rank;

//constructor
/*public Card(int n, String s, int r){
	number = n;
	suit = s;
	rank = r;
} */

//getters and setters
public int getNumber(){
	return number;
}

public void setNumber(int newNumber){
	number = newNumber;
}

public String getSuit(){
	return suit;
}

public void setSuit(String newSuit){
	suit = newSuit;
}

public int getRank(){
	return rank;
}

public void setRank(int newRank){
	rank = newRank;
}

    //dispalys the suit
	private char displaySuit(String c){
	  	switch (c) {
        	case "Spades":
          	  return ((char)'\u2660');
        	case "Diamonds":
          	  return ((char)'\u2666');
        	case "Clubs":
          	  return ((char)'\u2663');
        	case "Hearts":
        	  return ((char)'\u2764');
       	    }
          	  return ' ';
    	}

    //checks if the cards are equal or not
	public boolean isEqual(Card c){
		return (c.getNumber() == number) && (c.getSuit().equals(suit)) && (c.getRank() == rank);
		}

	//displays the card
	public void printCard(){
		System.out.println("Suit" + " " + displaySuit(suit) + " " + suit);
		System.out.println("Rank" + " " + rank);
		System.out.println("Number" + " " + number);
	}

	//compares the rank to make A Spades higher than A clubs
	public boolean isHigher(Card c) {
        if (c.getRank() < rank) {
                return true;
            } 
       			return false;
   		}

	//string toString is used to test the card
	public String toString(){
		return number + suit + rank;
	}
}
