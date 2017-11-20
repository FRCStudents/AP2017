import java.util.*;
/*
 * ArrayList work
 */

public class EArrayList {
  private ArrayList<Integer> arr = new ArrayList<Integer>();
  private int current;

  public EArrayList(){
    current = 0;
    }

  public int getLength(){
    return arr.size();
  }

  public void changeElt(int val, int i){
    if(i > 0 && i < arr.size() - 1){
        arr.set( i, val ); 
    } 
  }

  public void addElt(int val){
     arr.add(val); 
  }

  public void display(){
    System.out.print("\nArray: ");
    for (int i = 0; i < arr.size(); i++){
        System.out.print("[" + arr.get(i) + "]");
    }
    System.out.println();
  }
}
