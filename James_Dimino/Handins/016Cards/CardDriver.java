public class CardDriver{
	public static void main(String[] argv){

	Card a = new Card();

	a.setNumber(5);
	a.setColor("Black");
	a.setSide(true);
	a.setJoker(false);
	a.setSuit("Spades");
	
	a.printCard();

	Card b = new Card();

	b.setNumber(4);
	b.setColor("Red");
	b.setSide(true);
	b.setJoker(false);
	b.setSuit("Hearts");

	b.printCard();

	}
}