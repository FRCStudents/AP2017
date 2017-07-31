/*
 * Hangman... player gets 6 mistakes before losing.
 */
import java.util.*;

public class Player{
  private String name;
  private int misses;

  public Player(){
    Scanner reader = new Scanner(System.in);

    System.out.println("Please enter the player's name: ");
    name = reader.next();
    misses = 0;
  }

  public Player(String name){
    this.name = name;
    misses = 0;
  }

  public void increaseMisses(){
    misses++;
  }

  public String getName(){
    return name;
  }
  
  public int getMisses(){
    return misses;
  }

  public String toString(){
    return "Player: " + name + " with " + misses + " misses.";
  }
}
