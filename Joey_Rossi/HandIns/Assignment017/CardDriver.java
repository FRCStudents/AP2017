public class CardDriver {
	public static void main(String [] argv){

	Card c = new Card();

	c.setNumber(3);
	c.setFace(true);
	c.setSuit("Diamonds");
	c.setColor("Red");
	c.setRank(3);

	c.printCard();
	}		
}