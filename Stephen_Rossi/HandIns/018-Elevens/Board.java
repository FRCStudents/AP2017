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
          combineCards(); // done
          break;
        case(2):
          combineFaceCards(); // done
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
          quitGame(); // done  -   add help/rules
          break;
        default:
          parseError(); // done
          break;
      }
    }
  }

  public void dontCombine(int c){
    if(c == 1){
      System.out.println("Sorry those cards dont add up to 11, would you like to try again?");
    } else {
      System.out.println("Sorry, to combine face cards you need one jack, one queen, and one king");
    }
    System.out.print(" \n\nWould you like to try that again? If not you will be return to the board   (y/n):\n      >>");
    Scanner sc = new Scanner(System.in);
    String v = sc.next();
    if(v.charAt(0) == 'y'){
      if(c == 1){
        combineCards();
      } else {
        combineFaceCards();
      }
    } else if(v.charAt(0) == 'n') {
      displayBoard();
    }
  }

  public void combineCards(){
    System.out.print("\n\n\n What positions are the two cards you would like to combine?: \n         Card 1's Position   >>");
    Scanner sc1 = new Scanner(System.in);
    int first = sc1.nextInt();
    System.out.print("         Card 2's Position   >>");
    Scanner sc2 = new Scanner(System.in);
    int second = sc2.nextInt();
    combineCardsCheck(first, second);
  }

  public void combineCardsCheck(int f, int s){
    if(playSpaces[f-1].getValue() + playSpaces[s-1].getValue() != 11){
      dontCombine(1);
    } else {
      System.out.println("\n The " + this.playSpaces[f-1].getFaceValue() + this.playSpaces[f-1].getSuit() +" and the " + playSpaces[s-1].getFaceValue() + playSpaces[s-1].getSuit());
      System.out.print(" have been combined and moved to the discard pile, keep at it!");
      playSpaces[f - 1] = placeHolder;
      playSpaces[s - 1] = placeHolder;
      updatePlaySpaces();
      displayBoard();
    }
  }

  public void combineFaceCards(){
    System.out.print("\n\n\n What positions are the three face cards you would like to combine?: \n         Card 1's Position   >>");
    Scanner sc1 = new Scanner(System.in);
    int first = sc1.nextInt();
    System.out.print("         Card 2's Position   >>");
    Scanner sc2 = new Scanner(System.in);
    int second = sc2.nextInt();
    System.out.print("         Card 3's Position   >>");
    Scanner sc3 = new Scanner(System.in);
    int third = sc3.nextInt();
    combineFaceCardsCheck(first -1, second -1, third -1);
  }

  public void combineFaceCardsCheck(int f, int s, int t){
    int[] cards = {f,s,t};
    boolean kingCheck = false;
    boolean jackCheck = false;
    boolean queenCheck = false;
    for(int i = 0; i < 3; i++){
      if(playSpaces[cards[i]].getFaceValue() == "King"){
        kingCheck = true;
      }
      else if(playSpaces[cards[i]].getFaceValue() == "Queen"){
        queenCheck = true;
      }
      else if(playSpaces[cards[i]].getFaceValue() == "Jack"){
        jackCheck = true;
      }
    }
    boolean check = kingCheck && jackCheck && queenCheck;
    if(!check){
      System.out.println(" not" + check);
      dontCombine(0);
    } else {
      System.out.print("The selected King, Queen, and Jack have been combined and moved to the discard pile, keep at it!");
      playSpaces[f-1] = placeHolder;
      playSpaces[s-1] = placeHolder;
      playSpaces[t-1] = placeHolder;
      updatePlaySpaces();
      displayBoard();
    }
  }


  public void restartGame(){
    playDeck.shuffleDeck();
    this.gameStarted = false;
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
