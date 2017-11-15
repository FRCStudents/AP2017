public class Card {

	int number; //52 cards in a deck without jokers, 54 with jokers.
	String suit;
	int rank; //Value of each card. 
	boolean face;
	String color;

	public String getColor(){
		return color;
	}
	public void setColor(String new_color){
		color = new_color;
	}

	public int getNumber(){
		return number;
	}
	public void setNumber(int new_number){
		number = new_number;
	}
	public String getSuit(){
		return suit;
	}
	public void setSuit(String new_suit){
		suit = new_suit;
	}
	public int getRank(){
		return rank;
	}
	public void setRank(int new_rank){
		rank = new_rank;
	}
	public boolean getFace(){
		return face;
	}
	public void setFace(boolean up){
		face = up;
	}
	public char displaySuit(String c) {
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
	public void printCard(){
		System.out.println("\nCard: ");
		System.out.println("Number: " + number);
		System.out.println("Suit: " + suit + " " + displaySuit(suit));
		System.out.println("Color: " + color);
		System.out.println("Face: " + face);
		System.out.println("Rank: " + rank);
	}

	public boolean isEqual(Card c, Card d){
		if (c.number==(d.number)) {
			if (c.suit.equals(d.suit)) {
				return true;
			}else{
				return false;
			}
		}else{
			return false;
			}
	}
}