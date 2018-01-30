class CardDriver{
	public static void main (String[]argv){
	
	Card x = new Card();

	x.setNumber(1);
	x.setSuit("Spades");
	
	x.printCard();

	Card y = new Card();

	y.setNumber(8);
	y.setSuit("Hearts");

	y.printCard();

	}
}
