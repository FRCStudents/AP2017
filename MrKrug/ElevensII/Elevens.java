class Elevens {
    static Deck deck = new Deck();
    static Table table = new Table();

    public static void buildTable(){
      deck.shuffle(4);
      for(int i=0; i<9; i++){
        table.addCard(deck.dealCard());
      }
    }

    public static void playTable(){
      int firstTry[] = table.scanTable01();
      int secondTry[] = table.scanTable02();
      Card c;
      while(firstTry[0] > 0 || secondTry[0] > 0){
        for(int j=1; j <= firstTry[0]; j++){
          c = deck.dealCard();
          if(c == null) return;
          table.replaceCard(firstTry[j], c);
          }

        for(int k=1; k <= secondTry[0]; k++){
          c = deck.dealCard();
          if(c == null) return;
          table.replaceCard(secondTry[k], c);
          }
        firstTry = table.scanTable01();
        secondTry = table.scanTable02();
      }
      //table.displayTable();
    }

    public static boolean fillTable(int[] t){
      boolean r = false;
      for(int i=1; i<=t[0]; i++){
        table.replaceCard(t[i], deck.dealCard());
        r = true;
      }
      return r;
    }

    public static void playGame(){
      while(!deck.isEmpty()){
        playTable();
        Card c = deck.dealCard();
        if(c == null){
          System.out.println("Dealt null card - it's over!");
          return;
        }

        if(fillTable(table.matchTable01(c))){
          continue;
        }
        fillTable(table.matchTable02(c));
        table.displayTable();
        System.out.println("Deck Size: " + deck.deckSize());
      }
      System.out.println("Current Deck Size: " + deck.deckSize());
      table.displayTable();
    }

    public static void main(String[] argv){
      buildTable();
      playTable();
      playGame();
    }
}
