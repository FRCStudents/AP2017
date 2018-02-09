import java.util.*;

public class Table{

	Card[] gCard = new Card[9];

	ArrayList<Card> discard = new ArrayList<Card>();


	public void dicardACard(int i){
		discard.add(gCard[i]);
		gCard[i] = null;
	}
}