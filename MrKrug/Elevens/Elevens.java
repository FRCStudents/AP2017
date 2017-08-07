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
        System.out.print("{[" + suit + "][" + value + "]}");
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
        return "Card: [Value = " + this.value + "][Suit = " + this.suit + "]";
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
    Deck gameDeck;
    Card[] table = new Card[9];

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

public class Elevens{

  public static boolean playGame(){
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
      //System.out.println("\nContinue? ");
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
    //while(reader.next().equals("y"));
  }

  public static void main(String [] argv){
    boolean r = false;
    int games = 0;

    while(!r){
      r = playGame();
      games++;
    }
    System.out.println("It took " + games + " attempts to actually win...");
  }
}
