public class cardTryDriver{
	public static void main(String[] argv){

	cardTry a = new cardTry();

	a.setPlayer("Oswald");
	a.setNumber(8);
	//a.setColor("Black");
	a.setSide("Up");
	a.setSuit("Spade");
	a.setJoker(false);

	a.cardPrinter();

	system.out.println("");
	
	cardTry z = new cardTry();

	z.setPlayer("Oswald");
	z.setNumber(8);
	//z.setColor("Black");
	z.setSide("Up");
	z.setSuit("Spades");
	z.setJoker(false);

	z.cardPrinter();
	}
}
