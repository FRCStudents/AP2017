
import java.util.*;
/*
 * ArrayList work
 */

public class ArrList {
  private ArrayList<Integer> al = new ArrayList<Integer>();
  private int current;

  public ArrList(){
    current = 0;
    }

  public void loadArray(int val){
    al.set(current, val);
  }

  public void addElt(int val){
    al.add(val);
  }

  public void display(){
    System.out.print("\nArray: ");
    for (int i = 0; i < al.size(); i++){
        System.out.print("[" + al.get(i) + "]");
    }
    System.out.println();
  }
}
