class CardDriver {
    public static void main(String[] args){

    	Card a = new Card();





a.setRank(1);
		a.setSuit("Spades");
		a.setNumber(12);
		a.printCard();

		Card b = new Card ();
		b.setRank(2);
		b.setSuit("Diamonds");
		b.setNumber(8);
		b.printCard();


    	a.displaySuit(c.getSuit());
    	
    	a.isEqual(b);
    	if (a.isEqual){ System.out.println("Equal");}
			else {System.out.println("Not Equal");}
    	c.printCard();
    	c.ishigher(c.getRank());
    	c.toString();

    }
}
