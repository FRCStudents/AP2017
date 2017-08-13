import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * Elevens.java
 */

/******************************************************
 * AP Eleven's - as coded by yours truly...
 ******************************************************/

class Card {
    /* values: 1 - 13 => A - K */
    private int value;
    /* "Spades", "Hearts", "Diamonds", "Clubs" */
    private String suit;

    public Card(){
        this(1, "Spades");
        //System.out.println("Default Constructor");
    }

    public Card(int value, String suit){
        if(validate(value, suit)){
          this.value = value;
          this.suit = suit;
          }
        else {
          //System.out.println("Validate False: " + suit + " " + value);
          this.value = 1;
          this.suit = "Spades";
        }
    }

    private boolean validate(int value, String suit){
        if(suit.equals("Spades") ||
            suit.equals("Hearts") ||
            suit.equals("Diamonds") ||
            suit.equals("Clubs")){
              if(value > 0 && value < 14){
                return true;
              }
            }
            return false;
    }

    public void showCard(){
      String tab = "";

        if(value == 0){
          System.out.print("{\tEMPTY SPOT!\t\t}");
        } else {
          if(suit.equals("Clubs")){
            tab = "\t\t";
          } else {
            tab = "\t";
          }
          System.out.print("{\t[" + suit + "]" + tab + "[" + value + "]\t}");
      }
    }

    public int getValue(){
      return value;
    }

    public void setValue(int value){
      this.value = value;
    }

    public boolean isZero(){
      if(this.value == 0){
        return true;
      }
      return false;
    }

    public boolean isFace(){
        if(this.value > 10) return true;
        return false;
    }

    public boolean isEleven(Card c){
        if(this.value + c.value == 11){
          return true;
        }
        return false;
    }

    public boolean isEleven(Card c1, Card c2){
        if(c1.value + c2.value == 11){
          return true;
        }
        return false;
    }

    public boolean isEleven(int v1, int v2){
        if(v1 + v2 == 11){
          return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Card: [Value = " + this.value + "]\t[Suit = " + this.suit + "]";
    }
}


class Deck {
    ArrayList <Card> orderedSet = new ArrayList<Card>();
    ArrayList <Card> shuffledSet = new ArrayList<Card>();
    int currentPointer = 0;

    public Deck(){
      generateOrdered();
      shuffleDeck();
    }

    public void generateOrdered(){
      String[] suitList = new String[] {"Spades", "Hearts", "Diamonds", "Clubs"};
      for(int i=1; i < 14; i++){
        for(int j=0; j < 4; j++){
            orderedSet.add(new Card(i, suitList[j]));
        }
      }
    }

    public void shuffleDeck(){
      Card c;
      for(int i=0; i<52; i++){
          int r = (int)(Math.random() * orderedSet.size());
          c = orderedSet.get(r);
          shuffledSet.add(c);
          orderedSet.remove(r);
      }
    }

    /* return currrent card and move pointer */
    public Card getCurrent(){
        Card c = shuffledSet.get(currentPointer);
        if(endOfDeck()){
          currentPointer = 0;
          return c;
        }
        currentPointer++;
        return c;
    }

    public boolean endOfDeck(){
      if(currentPointer > 51) return true;
      return false;
    }

    public String toString(){
      String s = "";
      for(int i=0; i<52; i++){
          //System.out.println("HERE: " + i);
          s += shuffledSet.get(i).toString() + "\n";
      }
      return s;
    }
}

class Game {
    protected Deck gameDeck;
    protected Card[] table = new Card[9];

    public Game(){
      /* get a new shuffled deck */
      gameDeck = new Deck();
    }

    public void deal(){
      for(int i=0; i < 9; i++){
        table[i] = gameDeck.getCurrent();
      }
    }

    public boolean endOfGame(){
        if(tableEmpty() && gameDeck.endOfDeck()){
          return true;
        }
        return false;
    }

    public boolean tableEmpty(){
      for(int i=0; i<9; i++){
          if(!table[i].isZero()) return false;
      }
      return true;
    }

    public void showTable(){
      for(int i=0; i<9; i++){
        System.out.println();
        table[i].showCard();
      }
      System.out.println();
    }

    public boolean discardElevens(){
      boolean needMore = false;
        for(int i=0; i<9; i++){
          if(table[i].isFace()) continue;
          for(int j=i; j<9; j++){
            if(table[i].isFace()) continue;
            if(table[i].isEleven(table[j])){
              table[i].setValue(0);
              table[j].setValue(0);
              needMore = true;
            }
          }
        }
        return needMore;
    }

    public boolean discardFaceCards(){
      boolean needMore = false;

      for(int i=0; i < 9; i++){
        if(table[i].getValue() == 11){
          for(int j=0; j < 9; j++){
            if(table[j].getValue()  == 12){
              for(int k=0; k < 9; k++){
                if(table[k].getValue()  == 13){
                    table[i].setValue(0);
                    table[j].setValue(0);
                    table[k].setValue(0);
                    needMore = true;
                }
              }
            }
          }
        }
      }
      return needMore;
    }

    public void reDeal(){
      for(int i=0; i < 9; i++){
        if(table[i].isZero() && !gameDeck.endOfDeck()){
          table[i] = gameDeck.getCurrent();
        }
      }
    }
}

class GameInteractive extends Game {
    Scanner reader = new Scanner(System.in);
    public GameInteractive(){
      super();
    }

    @Override
    public void showTable(){
      for(int i=0; i<9; i++){
        System.out.print("\n[" + (i + 1) + "]: ");
        table[i].showCard();
      }
      System.out.println();
    }

    private boolean checkAndVoidElevens(int[] chosenCards){
      int v1 = table[chosenCards[0]].getValue();
      int v2 = table[chosenCards[1]].getValue();
      if(v1 + v2 == 11){
        table[chosenCards[0]].setValue(0);
        table[chosenCards[1]].setValue(0);
        return true;
        }
      return false;
    }

    private boolean checkAndVoidFaces(int[] chosenCards){
      int v1 = table[chosenCards[0]].getValue();
      int v2 = table[chosenCards[1]].getValue();
      int v3 = table[chosenCards[2]].getValue();
      if(((v1 == 11) && (v2 == 12) && (v3 == 13)) ||
        ((v1 == 12) && (v2 == 13) && (v3 == 11)) ||
        ((v1 == 13) && (v2 == 11) && (v3 == 12)) ||
        ((v1 == 11) && (v2 == 13) && (v3 == 12)) ||
        ((v1 == 12) && (v2 == 11) && (v3 == 13)) ||
        ((v1 == 13) && (v2 == 12) && (v3 == 11))){
          table[chosenCards[0]].setValue(0);
          table[chosenCards[1]].setValue(0);
          table[chosenCards[2]].setValue(0);
          return true;
        }
      return false;
    }

    @Override
    public boolean discardFaceCards(){
      int choices = 0;
      int[] chosenCards = new int[3];
      boolean discarded = false;

      for(int i=0; i<3; i++){
        chosenCards[i] = 0;
      }
      int r = 0;
      int cCptr = 0;

      System.out.println("Please press '0' to finish each pair or triplet.\n(press '99' to quit game.)");
      do {
        System.out.println("Please enter the next place number you want to choose (1-9): ");
        r = reader.nextInt();
        choices++;
        if(r == 99){
          System.out.println("That time you made " + (choices + 1) + " choices... and then quit.");
          System.exit(0);
        }
        if(r > 0){
          chosenCards[cCptr] = (r - 1);
          cCptr++;
        }
      } while((r > 0) && (cCptr < 3));

      if(cCptr > 2)
            discarded = checkAndVoidFaces(chosenCards);
      else
            discarded = checkAndVoidElevens(chosenCards);

      return discarded;
    }

    @Override
    public boolean discardElevens(){
      return false;
    }
}

class ElevensRun {
  public boolean playGame(){
    Scanner reader = new Scanner(System.in);
    boolean b1 = false;
    boolean b2 = false;

    int turns = 0;

    Game game = new Game();
    System.out.println();
    game.deal();
    game.showTable();
    System.out.println();
    do {
      game.showTable();
      b1 = game.discardFaceCards();
      b2 = game.discardElevens();

      if(game.endOfGame()){
        System.out.println("You won... in " + turns + " turns, you devil!");
        return true;
      }

      if(!(b1 || b2)){
        System.out.println("Sorry, you lost... in " + turns + " turns!");
        return false;
      }
      game.reDeal();
      turns++;
    } while(true);
  }

  public void run(){
    boolean r = false;
    int games = 0;
    while(!r){
      r = playGame();
      games++;
    }
    System.out.println("It took " + games + " attempts to actually win...");
  }
}

class ElevensRunInteractive extends ElevensRun {
  @Override
  public boolean playGame(){
    Scanner reader = new Scanner(System.in);
    boolean b1 = false;
    boolean b2 = false;

    int turns = 0;

    GameInteractive game = new GameInteractive();
    System.out.println();
    game.deal();
    game.showTable();
    System.out.println();
    do {
      game.showTable();
      b1 = game.discardFaceCards();
      b2 = game.discardElevens();
      if(!b1){
        System.out.println("Sorry, you lost... in " + turns + " turns!");
        return false;
      }

      if(game.endOfGame()){
        System.out.println("You won... in " + turns + " turns, you devil!");
        return true;
      }

      if(!(b1 || b2)){
        System.out.println("Sorry, you lost... in " + turns + " turns!");
        return false;
      }
      game.reDeal();
      turns++;
    } while(true);
  }
}

public class Elevens{

  public static void main(String [] argv){
    String s;
    Scanner reader = new Scanner(System.in);
    if(argv.length > 0){
        s = argv[0];
      } else {
        System.out.println("Would you like to play interactively? (y/(n)): ");
        s = reader.next();
      }

    ElevensRun ERun;
    if(s.substring(0,1).toLowerCase().equals("y")){
      ERun = new ElevensRunInteractive();
    } else {
      ERun = new ElevensRun();
    }

    ERun.run();
  }
}
