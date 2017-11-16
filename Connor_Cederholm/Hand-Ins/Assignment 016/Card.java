public class Card{
	private int number; //Jack is 11, Queen is 12, King is 13, Ace is 1
	private String suit;
	private int rank;

	public int getNumber(){
		return number;
	}
	public void setNumber(int n){
		number = n;
	}
	public String getSuit(){
		return suit;
	}
	public void setSuit (String suiii){
		suit = suiii;
	}
	public int getRank(){
		return rank;
	}
	public void setRank(int r){
		rank = r;
	}

	public boolean isEqual(Card c){
		if (c.getSuit() == suit){
			boolean a = true;
		}boolean a = false;
		
		if (c.getNumber() == number){
			 boolean b = true;
		}boolean b = false;

		if (a && b){
			return true;
		}return false;
	}

	public boolean isHigher(Card c){
		if (c.getRank()==rank){
			return true;
		}return false;
	}

	public void printCard(){
		System.out.println("Number:" + number);
		System.out.println("Suit:" + suit + displaySuit(suit));
		System.out.println("Rank:" + rank);
	}

	private char displaySuit(String c) {
              switch (c) {
                  case "Spades":
                      return ((char)'\uS');
                  case "Diamonds":
                      return ((char)'\uD');
                  case "Clubs":
                      return ((char)'\uC');
                  case "Hearts":
                      return ((char)'\uH');
              }
              return ' ';
      }
}