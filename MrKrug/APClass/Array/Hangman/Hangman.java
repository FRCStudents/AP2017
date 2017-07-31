/*
 * Hangman - the game
 */
import java.util.*;

public class Hangman{
  private Player player1;
  private Player player2;
  private int currentPlayer;

  String secretWord;
  char [] choices;

  public Hangman(){
    // player prompts for player's name...
    player1 = new Player();
    player2 = new Player();
    currentPlayer = 0;
  }

  public Player getCurrentPlayer(){
    if(currentPlayer > 0){
      return player1;
    }
    return player2;
  }

  private boolean matching(){
    //System.out.println("Mathing: ");
    for(int i=0; i<secretWord.length(); i++){
      //System.out.print("[" + secretWord.charAt(i) + "/" + choices[i] + "]");
      if(secretWord.charAt(i) != choices[i]){
        System.out.print("[f]");
        return false;
      }
    }
    return true;
  }

  public void changePlayers(){
    if(currentPlayer > 0){
      currentPlayer = 0;
    } else {
      currentPlayer = 1;
    }
  }

  private void enterWord(){
    System.out.println("\nPlease enter a secret word: ");
    Scanner s = new Scanner(System.in);
    secretWord = s.next();
    choices = new char[secretWord.length()];
    for(int i=0; i<choices.length; i++){
      choices[i] = '-';
    }
  }

  private char getChoice(){
    //System.out.println("\nPlease enter your chosen letter: ");
    Scanner s = new Scanner(System.in);
    String choice = s.next();
    return choice.charAt(0);
  }

  private boolean choiceInWord(char c){
    int i = secretWord.indexOf(c);
    System.out.println("Choice: " + i);
    if( i < 0){
      return false;
    }
    return true;
  }

  private void loadChoices(char c){
      for (int i=0; i < secretWord.length(); i++){
        if (c == secretWord.charAt(i)){
          choices[i] = c;
        }
      }
  }

  private void displayChoices(){
    System.out.println("");
    for(int i=0; i < choices.length; i++){
      System.out.print(choices[i]);
    }
    System.out.println("");
  }

  public void playGame(){
    Player current = getCurrentPlayer();
    enterWord();
    changePlayers();
    current = getCurrentPlayer();

    System.out.println(current.getName() + " Please choose... a letter.");
    char c = getChoice();

    while((current.getMisses() < 5) && (!matching())){
        if (choiceInWord(c)){
            loadChoices(c);
            displayChoices();
          } else {
            current.increaseMisses();
          }
        //System.out.println(current.getName() + " Missed: " + current.getMisses());
        System.out.println(current.getName() + " Please choose... a letter.");
        c = getChoice();
      }

    if(matching()){
      System.out.println(current.getName() + " Won");
    } else {
      changePlayers();
      current = getCurrentPlayer();
      System.out.println(current.getName() + " Won");
    }
  }
}
