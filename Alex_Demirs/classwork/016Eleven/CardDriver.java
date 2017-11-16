class CardDriver {
    public static void main(String[] args){

    	Card c = new Card();
    	c.displaySuit(c.getSuit());
    	
    	c.isEqual();
    	c.printCard();
    	c.ishigher(c.getRank());
    	c.toString();

    }
}
