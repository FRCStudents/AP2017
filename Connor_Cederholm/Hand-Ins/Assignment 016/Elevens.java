public class Elevens{
	Card [] playArea = new Card [9];
	Arraylist <Card> discard = new Arraylist <Card>();

	public void killCard(int i){
		discard.add playArea[i];
		playArea[i] = null;
	}
}