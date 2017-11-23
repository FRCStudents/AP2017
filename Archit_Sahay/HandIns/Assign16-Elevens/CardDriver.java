public class CardDriver{
	public static void main(String[] argv){

	Card a = new Card();

	//a.setPlayer("Oswald");
	a.setNumber(8);
	//a.setColor("Black");
	//a.setSide("Up");
	a.setSuit("Hearts");
	//a.setJoker(false);
	a.setRank(2);

	a.cardPrinter();

	
	Card z = new Card();

	//z.setPlayer("Oswald");
	z.setNumber(8);
	//z.setColor("Black");
	//z.setSide("Up");
	z.setSuit("Spades");
	//z.setJoker(false);
	z.setRank(1);

	z.cardPrinter();

	a.isEqual(z);
		if (a.isEqual(z)){ System.out.println("It's Equal");}
			else {System.out.println("It's Not Equal");}
	}
}
