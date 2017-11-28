
public class Game2{
	Deck deck = new Deck();
	Table table = new Table();
	Card card = new Card();

	public void doTable(){
		while(table.scanTable01());
		//table.showDiscard();
		table.replaceCards(deck);
		//table.showDiscard();
		while(table.scanTable02());
		//table.showDiscard();
		table.replaceCards(deck);
	}

	public void doTable(Card c){
		boolean used = false;
		if(!table.scanTable01(c) && !table.scanTable02(c)){
			table.throwOnPile(c);
		} 
		//else {
	 	//		table.throwOnDiscard(c);
  		//} 

		table.replaceCards(deck);
		while(table.scanTable01());
		table.replaceCards(deck);
		while(table.scanTable02());
		table.replaceCards(deck);
	}

	public void doPile(){
		while(table.scanPile());
		table.replaceCards(deck);
	}

	public void playGame(){
		boolean ret;

		deck.shuffle(20);
   		for(int i=0; i < 9; i++){
			table.addCard(deck.dealCard());
		}

		doTable();
                table.displayTable();
		card = deck.dealCard();
		while(!deck.isEmpty()){
			doTable();
			doTable(deck.dealCard());
			doPile();
			table.displayTable();
			table.showPile();
			table.showDiscard();
		} 

		doTable();
		doPile();
		System.out.println("\n================== The end, my friend... ==========================");
		table.scanTable01(deck.getFirst());
		table.scanTable02(deck.getFirst());
		table.replaceCards(deck);

		table.scanTable01(deck.getCard(1));
		table.scanTable02(deck.getCard(1));
		table.replaceCards(deck);

		table.displayTable();
		table.showPile();
		table.showDiscard();
		//System.out.println("Checking: " + table.checkDiscard());
		//System.out.println("Checking: " + table.checkTableDiscard());
		System.out.println("\n\n");
	}
} 
	
