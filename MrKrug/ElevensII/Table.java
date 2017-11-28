import java.util.*;

class Table {
	Card [] cards;
	// discard is the pile of matched cards
	ArrayList <Card> discard = new ArrayList<Card>();
	ArrayList <Card> pile = new ArrayList<Card>();

	int currentCard = -1;

	public Table(){
		cards = new Card[9];
	}

	public boolean checkDiscard(){
		for(int i=0; i < discard.size(); i++){
			for(int j=i; j < discard.size(); j++){
				if(discard.get(i).isEqual(discard.get(j))){
					//System.out.println("\nChecking! " + discard.get(i).getValue() + ": " + i + "[" + j + "]");
					return true;
					}
			}
		}
	return false;
	}

	public boolean checkTableDiscard(){
		for(int i=0; i < cards.length; i++){
			for(int j=0; j < discard.size(); j++){
				if(cards[i] == null) return false;
				if(cards[i].isEqual(discard.get(j))){
					//System.out.println("\nChecking: " + discard.get(j).getValue() + " [" + j + "]");
					return true;
				}
			}
		}
	return false;
	}

	public void throwOnPile(Card c){
		Card hold = new Card(c);
		pile.add(hold);
	}

	public void throwOnDiscard(Card c){
		Card hold = new Card(c);
		discard.add(hold);
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

        public void showPile(){
                System.out.println("\n----------------- P i l e  --------------------\n");
                for(int i=0; i<pile.size(); i++){
                        if(i % 8 == 0){
                                System.out.println("");
                        }
                        pile.get(i).printCard();
                }
        }


	public void showDiscard(){
		System.out.println("\n----------------- D i s c a r d --------------------\n");
		for(int i=0; i<discard.size(); i++){
			if(i % 8 == 0){
				System.out.println("");
			}
			discard.get(i).printCard();
		}
	}

	public void replaceCards(Deck d){
		for(int i=0; i<9; i++){
			if(cards[i] == null){
				if(d.isEmpty()) return;
				cards[i] = d.dealCard();
			}
		} 
	}

	public void displayTable(){
		System.out.println("\n========== Table ============");
		int rowCount = 0;
		for(int i=0; i<9; i++){
				if(rowCount == 3){
					System.out.println("");
					rowCount = 0;
				}
 				if(cards[i] == null){
					System.out.print("\tNULL");
					}
				else {
					cards[i].printCard();
				}
				rowCount++;
		}
		System.out.println("\n========== Table ============");
	}

	private boolean royalMatch(int i, int j, int k){
		int x = i + j + k;
		if(x != 36) return false;

		if((i < 11) || (j < 11) || (k < 11)) return false;
		if((i == j) && (j == k)){
			return false;
		}
		return true;
	}

	public boolean scanPile(){
		if(pile.size() > 2){
			if(royalMatch(pile.get(pile.size() - 1).getValue(), 
						pile.get(pile.size() - 2).getValue(), 
						pile.get(pile.size() - 3).getValue())){
				throwOnDiscard(pile.get(pile.size() - 1));
				throwOnDiscard(pile.get(pile.size() - 2));
				throwOnDiscard(pile.get(pile.size() - 3));
				System.out.println("\nRemoving: " + (pile.size() - 1) + pile.get(pile.size() - 1).getValue());
				pile.remove(pile.size() - 1);
				System.out.println("\nRemoving: " + (pile.size() - 1) + pile.get(pile.size() - 1).getValue());
				pile.remove(pile.size() - 1);
				System.out.println("\nRemoving: " + (pile.size() - 1) + pile.get(pile.size() - 1).getValue());
				pile.remove(pile.size() - 1);
				return true;
				}
		}
		if(pile.size() > 1){
			if(matchEleven(pile.get(pile.size() - 1).getValue(), pile.get(pile.size() - 2).getValue())){
				throwOnDiscard(pile.get(pile.size() - 1));
				throwOnDiscard(pile.get(pile.size() - 2));
				System.out.println("\nRemoving: " + (pile.size() - 1) + pile.get(pile.size() - 1).getValue());
				pile.remove(pile.size() - 1);
				System.out.println("\nRemoving: " + (pile.size() - 1) + pile.get(pile.size() - 1).getValue());
				pile.remove(pile.size() - 1);
				return true;
				}
		}
		return false;
	}

	public boolean matchEleven(int i, int j){
		if(i + j == 11) return true;
		return false;
	}

	public boolean scanTable01(){
		for(int i=0; i < 9; i++){
			for(int j=i; j<9; j++){
				if(cards[i] == null || cards[j] == null) continue;
				if(matchEleven(cards[i].getValue(), cards[j].getValue())){
					//System.out.println("\nMatch: " + cards[i].getValue() + ":" + cards[j].getValue());
					throwOnDiscard(cards[i]);
					cards[i] = null;
					throwOnDiscard(cards[j]);
					cards[j] = null;
					return true;
				}
			}
		}
		return false;
	}

        public boolean scanTable01(Card c){
                for(int i=0; i < 9; i++){
                                if(cards[i] == null) continue;
                                if(matchEleven(cards[i].getValue(), c.getValue())){
				  	//System.out.println("\nMatch: " + cards[i].getValue() + ":" + c.getValue());
					throwOnDiscard(cards[i]);
					throwOnDiscard(c);
                                        cards[i] = null;
                                        return true;
                                }
                        }
	//	throwOnPile(c);
                return false;
        }

	public boolean scanTable02(){
		for(int i=0; i < 9; i++){
			for(int j=i; j < 9; j++){
			 	for(int k=j; k < 9; k++){
					if(cards[i] == null || cards[j] == null || cards[k] == null) continue;
					if(royalMatch(cards[i].getValue(), cards[j].getValue(), cards[k].getValue())){
						//System.out.println("Match: " + cards[i].getValue() + ":" + cards[j].getValue() + ":" + cards[k].getValue());
						throwOnDiscard(cards[i]);
						throwOnDiscard(cards[j]);
						throwOnDiscard(cards[k]);
						cards[i] = null;
						cards[j] = null;
						cards[k] = null;
						return true;
					}
				}
			}
		}
	return false;
	}

        public boolean scanTable02(Card c){
                for(int i=0; i < 9; i++){
                        for(int j=i; j < 9; j++){
                               if(cards[i] == null || cards[j] == null) continue;
                               if(royalMatch(cards[i].getValue(), cards[j].getValue(), c.getValue())){
				     //System.out.println("Match: " + cards[i].getValue() + ":" + cards[j].getValue() + ":" + c.getValue());
				     throwOnDiscard(c);
				     throwOnDiscard(cards[i]);
				     throwOnDiscard(cards[j]);
                                     cards[i] = null;
                                     cards[j] = null;
                                     return true;
                                }
                        }
		}
	//	throwOnPile(c);
        return false;
        }

}
