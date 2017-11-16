public class Card{

	int number;
	String color;
	boolean side; //True = Card Is Face Side Up
	boolean joker;
	String suit;
	int rank;
	boolean checkA;
	boolean checkB;

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

	public int getRank(){
		return rank;
	}

	public void setRank(int new_rank){
		rank = new_rank;
	}

	public void printCard(){
		System.out.println("\nCard: ");
		System.out.println("Number: " + number);
		System.out.println("Suit: " + suit + " " + displaySuit(suit));
		System.out.println("Color: " + color);
		System.out.println("Side: " + side);
		System.out.println("isJoker: " + joker);
		System.out.println("Rank: " + rank);
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

	//
	// nice
	// remember - compare Strings with the isEqual method on Strings
	// 		not == 
	//		c.getSuit().isEqual(suit)...
	//	

    public boolean isEqual(Card c){
        if (c.getSuit() == suit){
            boolean checkA = true;
        } else {
        	boolean checkA = false;
        }

        if (c.getNumber() == number){
             boolean checkB = true;
        } else {
        	boolean checkB = false;
        }

	// this could have been:
	// return checkA && checkB; 
       if (checkA && checkB){
            return true;
        } else {
        	return false;
        }
    }

    public boolean isHigher(Card c){
	//
	// if suit is a String, what does it mean if one
	// is greater than the other?
	//
        if (c.getSuit() > suit){
            boolean checkA = true;
        } else {
        	boolean checkA = false;
        }

        if (c.getNumber() > number){
             boolean checkB = true;
        } else {
        	boolean checkB = false;
        }

	// do both number and suit have to be higher?
	// which is higher, the 10 of hearts or the 10 of spades?
	// which is higher, the 2 of hearts or the 10 of clubs?
	//
        if (checkA && checkB){
            return true;
        } else {
        	return false;
        }
    }

}
