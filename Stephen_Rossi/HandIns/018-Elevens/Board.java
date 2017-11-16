import java.util.Scanner;
public class Board{
  private Card[] playSpaces = new Card[9];
  private Card[] discard = new Card[52];
  private int deckPos;
  private boolean gameStarted = false;

  Deck playDeck = new Deck();
  Card placeHolder = new Card("Elevens", "Elevens");

  public Board(){
    this.deckPos = 0;
    for(int i = 0; i < this.playSpaces.length; i++){
      this.playSpaces[i] = placeHolder;
    }
  }

  public void newGame(){
    playDeck.shuffleDeck();
    this.deckPos = 0;
    for(int i = 0; i < this.playSpaces.length; i++){
      this.playSpaces[i] = placeHolder;
    }
    displayBoard();
  }

  public void updateDeckPos(){
    this.deckPos++;
  }

  public String isSpacer(){
    if(playDeck.getLength() <= 9){
      return " ";
    }
    else{
      return "";
    }
  }

  public String cardName(int p){
    if(playSpaces[p].getFaceValue() == "Elevens"){
      return "Elevens";
    }
    else if(playSpaces[p].getFaceValue() == "Queen"){
      return " Queen ";
    }
    else if(playSpaces[p].getFaceValue() == "King"){
      return " King  ";
    }
    else if(playSpaces[p].getFaceValue() == "Jack"){
      return " Jack  ";
    }
    else if(playSpaces[p].getFaceValue() == "Ace"){
      return "  Ace  ";
    }
    else if(playSpaces[p].getValue() == 10){
      return "  "+playSpaces[p].getFaceValue()+"   ";
    }
    else if(playSpaces[p].getValue() < 10){
      return "   "+playSpaces[p].getFaceValue()+"   ";
    }
    else{
      return "*ERROR*";
    }
  }

  public void displayBoard(){
    System.out.println("\n\n");
    System.out.println("+-------+");
    System.out.println("|       |");
    System.out.println("|  " + isSpacer() + (playDeck.getLength() - deckPos) + "   |");
    System.out.println("|       |");
    System.out.println("| Cards |");
    System.out.println("|       |");
    System.out.println("| Left  |");
    System.out.println("|       |");
    System.out.println("+-------+");
    System.out.println("");
    System.out.println("               1.          2.          3.");
    System.out.println("           +-------+   +-------+   +-------+");
    System.out.println("           |      "+ playSpaces[0].getSuit() +"|   |      "+ playSpaces[1].getSuit() +"|   |      "+ playSpaces[2].getSuit() +"|");
    System.out.println("           |       |   |       |   |       |");
    System.out.println("           |"+ cardName(0) + "|   |"+ cardName(1) + "|   |"+ cardName(2) + "|");
    System.out.println("           |       |   |       |   |       |");
    System.out.println("           |"+ playSpaces[0].getSuit() +"      |   |"+ playSpaces[1].getSuit() +"      |   |"+ playSpaces[2].getSuit() +"      |");
    System.out.println("           +-------+   +-------+   +-------+");
    System.out.println("");
    System.out.println("               4.          5.          6.");
    System.out.println("           +-------+   +-------+   +-------+");
    System.out.println("           |      "+ playSpaces[3].getSuit() +"|   |      "+ playSpaces[4].getSuit() +"|   |      "+ playSpaces[5].getSuit() +"|");
    System.out.println("           |       |   |       |   |       |");
    System.out.println("           |"+ cardName(3) + "|   |"+ cardName(4) + "|   |"+ cardName(5) + "|");
    System.out.println("           |       |   |       |   |       |");
    System.out.println("           |"+ playSpaces[3].getSuit() +"      |   |"+ playSpaces[4].getSuit() +"      |   |"+ playSpaces[5].getSuit() +"      |");
    System.out.println("           +-------+   +-------+   +-------+");
    System.out.println("");
    System.out.println("               7.          8.          9.");
    System.out.println("           +-------+   +-------+   +-------+");
    System.out.println("           |      "+ playSpaces[6].getSuit() +"|   |      "+ playSpaces[7].getSuit() +"|   |      "+ playSpaces[8].getSuit() +"|");
    System.out.println("           |       |   |       |   |       |");
    System.out.println("           |"+ cardName(6) + "|   |"+ cardName(7) + "|   |"+ cardName(8) + "|");
    System.out.println("           |       |   |       |   |       |");
    System.out.println("           |"+ playSpaces[6].getSuit() +"      |   |"+ playSpaces[7].getSuit() +"      |   |"+ playSpaces[8].getSuit() +"      |");
    System.out.println("           +-------+   +-------+   +-------+");
    System.out.println("");
    System.out.println("\n\n __________________________________________________________ \n\n");
    if(gameStarted){
      System.out.println("                   What would you like to do? ");
      System.out.println("                  +--------------------------+");
      System.out.println("                   |    1. Combine Cards      |");
      System.out.println("                   |  2. Combine Face Cards   |");
      System.out.println("                   |    3. Restart Game       |");
      System.out.println("                   |         4. Quit          |");
      System.out.println("                  +--------------------------+\n");
      System.out.print("       >  ");

      Scanner scanner = new Scanner(System.in);
      parseMenu(scanner.nextInt());
    } else {
      System.out.println("                   What would you like to do? ");
      System.out.println("                  +--------------------------+");
      System.out.println("                   |      1. Start Game       |");
      System.out.println("                   |         2. Quit          |");
      System.out.println("                  +--------------------------+\n");
      System.out.print("       >  ");

      Scanner scanner = new Scanner(System.in);
      parseMenu(scanner.nextInt());
    }
  }

  public void parseMenu(int c){
    if(gameStarted){
      switch(c){
        case(1):
          combineCards();
          break;
        case(2):
          combineFaceCards();
          break;
        case(3):
          restartGame(); // done
          break;
        case(4):
          quitGame(); // done
          break;
        default:
          parseError(); // done
          break;
      }
    } else if(!gameStarted) {
      switch(c){
        case(1):
          startGame(); // done
          break;
        case(2):
          quitGame(); // done
          break;
        default:
          parseError(); // done
          break;
      }
    }
  }

  public void combineCards(){
    System.out.println("\n\n\n What positions are the cards you would like to combine in? (ex. 1,4): \n            >>");
    Scanner s = new Scanner(System.in);
    combineCardsCheck(playScapes[s.nextInt() - 1], playScapes[s.nextInt() - 1]);
  }

  public void combineCardsCheck(int f, int s){
    if(f + s != 11){
      dontCombine(1);
    } else {
      
    }
  }

  public void combineFaceCards(){

  }

  public void restartGame(){
    playDeck.shuffleDeck();
    this.deckPos = 0;
    for(int i = 0; i < this.playSpaces.length; i++){
      this.playSpaces[i] = placeHolder;
    }
    displayBoard();

  }

  public void quitGame(){
    System.exit(1);
  }

  public void startGame(){
    this.gameStarted = true;
    updatePlaySpaces();
    displayBoard();
  }

  public void parseError(){
    System.out.println("\n\n\n\n\n **ERROR** Please answer with an accpetable value listed below\n\n\n");
    if(gameStarted){
      System.out.println("                   What would you like to do? ");
      System.out.println("                  +--------------------------+");
      System.out.println("                   |    1. Combine Cards      |");
      System.out.println("                   |  2. Combine Face Cards   |");
      System.out.println("                   |    3. Restart Game       |");
      System.out.println("                   |         4. Quit          |");
      System.out.println("                  +--------------------------+\n");
      System.out.print("       >  ");

      Scanner scanner = new Scanner(System.in);
      parseMenu(scanner.nextInt());
    } else {
      System.out.println("                   What would you like to do? ");
      System.out.println("                  +--------------------------+");
      System.out.println("                   |      1. Start Game       |");
      System.out.println("                   |         2. Quit          |");
      System.out.println("                  +--------------------------+\n");
      System.out.print("       >  ");

      Scanner scanner = new Scanner(System.in);
      parseMenu(scanner.nextInt());
    }
  }

  public void updatePlaySpaces(){
    for(int l = 0; l < playSpaces.length; l++){
       if(playSpaces[l].getValue() == -999){
         playSpaces[l] = playDeck.deck[deckPos];
         playDeck.deck[deckPos].flip();
         updateDeckPos();
       }
    }
  }


}
