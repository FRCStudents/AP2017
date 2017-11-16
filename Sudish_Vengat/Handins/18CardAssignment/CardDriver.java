public class CardDriver{
	
	public static void main(String[] argv){

		Card c = new Card();

		c.setNumber(3);
		c.setSuit("Spades");
		c.setRank(5);
		c.printCard();
	}
}