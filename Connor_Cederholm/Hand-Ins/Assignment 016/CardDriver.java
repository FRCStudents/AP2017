public class CardDriver{
	public static void main (String [] argv ){
		Card a = new Card();

		a.setRank(1);
		a.setSuit("Spades");
		a.setNumber(12);
		a.printCard();

		Card b = new Card ();
		b. setRank(2);
		b.setSuit("Diamonds");
		b.setNumber(8);
		b.printCard();

		a.isEqual(b);
		if (a.isEqual){ System.out.println("Yeeahhh its Equal");}
			else {System.out.println("Not quite Equal");}
	}
}