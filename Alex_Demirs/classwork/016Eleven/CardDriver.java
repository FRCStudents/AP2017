class CardDriver {
    public static void main(String[] args){

    	Card a = new Card();
    	a.displaySuit(a.getSuit());
    	
    	a.isEqual(a);
    	a.printCard();
    	a.ishigher(a.getRank());
    	a.toString();

	Card c = new Card();
	c.setNumber(10);
	c.setRank(10);
	c.setSuit("Clubs");
	c.printCard();
	System.out.println("Compare cards: " + a.ishigher(c.getRank()));
    }
}
