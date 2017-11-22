
import java.util.*;
/*
 * ArrayList work
 */

public class FArrayList {
  private ArrayList<Integer> arr = new ArrayList<Integer>();
  private int current;

  public FArrayList(){
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

  public void fillArray(){
	for(int i=0; i<20; i++){
		arr.add(i*i);
		}
  }

  public void kill(int i){
	arr.remove(i);
  }

  public void killTwo(int i){
        arr.remove(i);
	arr.remove(i+ 1);
  }

  public void killTwoBack(int i){
	arr.remove(i + 1);
	arr.remove(i);
  }
  public void display(){
    System.out.print("\nArray: ");
    for (int i = 0; i < arr.size(); i++){
        System.out.print("[" + arr.get(i) + "]");
    }
    System.out.println();
  }
}
