class Card {

	// Attributes
	String number;
	String suit;
	int rank;
	boolean face_up; // true == side with numbers and suits

	// Constructor
	public Card(String num, String s, boolean side) {
		setNumber(num);
		setSuit(s);
		setFace_up(side);
	}

	public Card() {
		this("2", "Hearts", true);
	}


	// Getters and Setters
	public String getNumber() {
		return number;
	}

	public void setNumber(String new_num) {
		number = new_num;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String new_suit) {
		suit = new_suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int new_rank) {
		rank = new_rank;
	}

	public boolean getFace_up() {
		return face_up;
	}

	public void setFace_up(boolean front) {
		face_up = front;
	}

	private char displaySuit(String c) {
		switch(c) {
			case "Spades": return ((char)'\u2660');
			case "Diamonds": return ((char)'\u2666');
			case "Clubs": return ((char)'\u2663');
			case "Hearts": return ((char)'\u2764');
		}
		return ' ';
	}

	public boolean isEqual(Card c, Card d) {
		if (c.number.equals(d.number)) {
			if (c.suit.equals(d.suit)) {
				//System.out.println("true");
				return true;
			} else {
				//System.out.println("false");
				return false;
			}
		} else {
			//System.out.println("false");
			return false;
		}
	}

	public void printCard(Card c) {
		System.out.println(c.number + displaySuit(c.suit));
	}

	public String toString() {
		return this.number + this.suit;
	}

	// I put isHigher() in the deck because it made more sense to me
	// Since the ranking depends on what is set in the Deck

	// My Card object is meant to deal with individual cards
	// My Deck object is meant to deal with groups of cards




}