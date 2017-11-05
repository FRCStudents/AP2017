// Whatever game...

class Game {
  private String name;

  private Deck deck01;
  private Deck deck02;

  private Card[] table = new Card[52];
  private int tablePointer = 0;
  private Card[] discard = new Card[52];
  private int discardPointer = 0;

  private Card[] elevensBoard = new Card[9];
  private int matchCount = 0;

  public Game(){
      name = "Elevens";
      deck01 = new Deck();
  }

  public void showElevensBoard(){
    int elevensBoardPointer = 0;
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        System.out.print("BOARD ========> ");
        if(elevensBoard[elevensBoardPointer] == null){
          System.out.println("NULL");
          elevensBoardPointer++;
          continue;
        }
        elevensBoard[elevensBoardPointer].printCard();
        elevensBoardPointer++;
      }
      System.out.println("");
    }
  }

  public void dealToElevensBoard(){
      for(int j = 0; j < 9; j++){
        if(elevensBoard[j] == null){
          elevensBoard[j] = deck01.dealCard();
         }
      }
  }

  // rules of Elevens
  public boolean elevensMatch(Card c1, Card c2){
      if(c1 == null) return false;
      if(c2 == null) return false;

      if(c1.getValue() + c2.getValue() == 11){
        matchCount++;
        return true;
      }
      if((c1.getValue() == c2.getValue()) && c1.getValue() > 10){
        matchCount++;
        return true;
      }
      return false;
    }

  private void printGame(Card c, Card c2){
    if(tablePointer < 1) return;
    System.out.println("===============================");
    System.out.println("Table: " + table[tablePointer-1].getValue());
    System.out.println("Last Draw: " + c);
    System.out.println("This Draw: " + c2);
    System.out.println("===============================");
  }

  public boolean checkBoard(Card inPlay){
      for(int i=0; i<9; i++){
        if(elevensBoard[i] == null) continue;
        if(elevensMatch(elevensBoard[i], inPlay)){
          discard[discardPointer] = elevensBoard[i];
          elevensBoard[i] = null;
          return true;
        }
      }
      return false;
  }

  public void playElevens(){
      int turns = 0;
      deck01.shuffle(3);
      while(!deck01.isEmpty()){
        dealToElevensBoard();
        Card newCard = deck01.dealCard();
        checkBoard(newCard);
        turns++;
      }
      showElevensBoard();
      System.out.println("Turns: " + turns);
      System.out.println("Matches: " + matchCount);
  }

  public void playGame(){
    int gamesPlayed = 0;
    int mostMatches = 0;

    deck01.shuffle(20);
    deck01.resetDeal();
    while ((matchCount < 19) && (gamesPlayed < 1000)){
      playElevens();
      if(mostMatches < matchCount){
        mostMatches = matchCount;
      }
      gamesPlayed++;
    }
    System.out.println("Most Matches attained in one game: " + mostMatches);
    System.out.println("Games Played: " + gamesPlayed);
  }
}
