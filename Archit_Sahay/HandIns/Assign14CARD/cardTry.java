public class cardTry{

	String player;
	int number;
	//String color;
	String side; 
	boolean joker;
	String suit;
	int rank;
	boolean checkA;
	boolean checkB;
	
	public String getPlayer(){
		return player;
	}

	public void setPlayer(String new_player){
		player=new_player;
	}

	public int getNumber(){
		return number;
	}

	public void setNumber(int new_number){
		number = new_number;
	}

	//public String getColor(){
	//	return color;
	//}

	//public void setColor(String new_color){
	//	color = new_color;
	//}

	public String getSide(){
		return side;
	}

	public void setSide(String new_side){
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


public void cardPrinter(){
		System.out.println("\nName: " + player );
		System.out.println("Card: ");
		System.out.println("Number: " + number);
		System.out.println("Suit: " + suit + " " + displaySuit(suit));
		//System.out.println("Color: " + color);
		System.out.println("Side: " + side);
		System.out.println("It's a joker: " + joker);
		System.out.println("Rank: " + rank);
	}

	public char displaySuit(String c) {
              switch (c) {
                  case "Spades":
                      return ((char)"♠");
                  case "Diamonds":
                      return ((char)"♦");
                  case "Clubs":
                      return ((char)"♣");
                  case "Hearts":
                      return ((char)"♥");
              }
              return ' ';
      }
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

        if (checkA && checkB){
            return true;
        } else {
        	return false;
        }
    }

    public boolean isHigher(Card c){
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

        if (checkA && checkB){
            return true;
        } else {
        	return false;
        }
    }


} 