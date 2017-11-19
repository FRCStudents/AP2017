import java.util.*;

class Table {
	Card [] cards;
	ArrayList <Card> discard = new ArrayList<Card>();

	int currentCard = -1;

	public Table(){
		cards = new Card[9];
	}

	public void addCard(Card c){
		if(currentCard > 8) return;
		currentCard++;
		cards[currentCard] = c;
	}

	public Card takeCard(int place){
		Card c = cards[place];
		cards[place] = null;
		return c;
	}

	public void showDiscard(){
		for(int i=0; i<discard.size(); i++){
			discard.get(i).printCard();
		}
	}

	public void replaceCard(int place, Card c){
		//System.out.println("replaceCard: " + cards[place].getValue() + " by " + c.getValue());
		if(c == null) return;
		
		discard.add(cards[place]);
		cards[place] = c;
	}

	public void displayTable(){
		System.out.println("\n========== Table ============");
		int rowCount = 0;
		for(int i=0; i<9; i++){
				if(rowCount == 3){
					System.out.println("");
					rowCount = 0;
				}
				cards[i].printCard();
				rowCount++;
		}
		System.out.println("\n========== Table ============");
	}

	// brute force!
	private boolean royalMatch(int i, int j, int k){
		if(i == 11 && j == 12 && k == 13) return true;
		if(i == 11 && j == 13 && k == 12) return true;
		if(i == 12 && j == 11 && k == 13) return true;
		if(i == 12 && j == 13 && k == 11) return true;
		if(i == 13 && j == 11 && k == 12) return true;
		if(i == 13 && j == 12 && k == 11) return true;
		return false;
	}

	//
	// matches parameter card to the cards on the table
	// return an array of int
	// first element: number of items (0,2)
	// second two elements - index of item that can be replaced
	//
	public int[] matchTable01(Card c){
		if(c != null)
			System.out.println("Matching: " + c.getValue());
		int[] r = new int[3];
		for(int i=0; i < 9; i++){
				if(c.getValue() + cards[i].getValue() == 11){
					r[0] = 2; r[1] = i;
					return r;
				}
			}
	r[0] = 0;
	return r;
	}

	//
	// return an array of int
	// first element: number of items (0,3)
	// second two elements - indices of items that can be replaced
	//
	public int[] scanTable01(){
		int[] r = new int[3];
		for(int i=0; i < 9; i++){
			for(int j=i; j<9; j++){
				if(cards[i].getValue() + cards[j].getValue() == 11){
					r[0] = 2; r[1] = i; r[2] = j;
					return r;
				}
			}
		}
	r[0] = 0;
	return r;
	}

	//
	// return an array of int
	// first element: number of items (0, 3)
	// next 3 elements  indices of items to be replaced
	//
	public int[] matchTable02(Card c){
		if(c != null)
			System.out.println("Matching2: " + c.getValue());
		int[] r = new int[4];
		for(int i=0; i < 9; i++){
			for(int j=i; j<9; j++){
					if(royalMatch(cards[i].getValue(), cards[j].getValue(), c.getValue())){
						r[0] = 3; r[1] = i; r[2] = j;
						return r;
				}
			}
		}
	r[0] = 0;
	return r;
	}

	//
	// return an array of int
	// first element: number of items (0, 3)
	// next 3 elements  indices of items to be replaced
	//
	public int[] scanTable02(){
		int[] r = new int[4];
		for(int i=0; i < 9; i++){
			for(int j=i; j<9; j++){
				for(int k=j; k<9; k++){
					if(royalMatch(cards[i].getValue(), cards[j].getValue(), cards[k].getValue())){
						r[0] = 3; r[1] = i; r[2] = j; r[3] = k;
						return r;
					}
				}
			}
		}
	r[0] = 0;
	return r;
	}
}
