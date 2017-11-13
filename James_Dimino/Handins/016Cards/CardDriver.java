public class CardDriver{
	public static void main(String[] argv){

	Card c = new Card();

	c.setNumber(5);
	c.setColor("Black");
	c.setSide(true);
	c.setJoker(false);
	c.setSuit("Spades");

	System.out.println("Number: " + c.getNumber());
	System.out.println("Color: " + c.getColor());
	System.out.println("Side: " + c.getSide());
	System.out.println("isJoker: " + c.getJoker());
	System.out.println("Suit: " + c.getSuit());

	}
}