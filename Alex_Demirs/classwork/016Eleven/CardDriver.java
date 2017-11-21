class CardDriver {
    public static void main(String[] args){

		Card a = new Card();
		a.setRank(1);
		a.setSuit("Spades");
		a.setNumber(12);
		a.printCard();

		Card c = new Card ();
		c. setRank(2);
		c.setSuit("Diamonds");
		c.setNumber(8);
		c.printCard();

		if(c.isEqual(a)) { System.out.println("Equal");}
			else {System.out.println("Not Equal");}

    }
}
