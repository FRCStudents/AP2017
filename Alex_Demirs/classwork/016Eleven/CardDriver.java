class CardDriver {
    public static void main(String[] args){

    	Card a = new Card();
    	a.displaySuit(a.getSuit());
    	
    	a.isEqual(a.getNumber());
    	a.printCard();
    	a.ishigher(a.getRank());
    	a.toString();
    }
}