import java.util.*;
/*
 * ArrayList work
 */

class SArrayList {
  private ArrayList<Integer> arr = new ArrayList<Integer>();
  private int current;

  public SArrayList(){
    current = 0;
    }

  public int getLength(){
    return arr.size();
  }

  public void changeElt(int val, int i){
    if(i > 0 && i <= arr.size() - 1){
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

  public static void main(String[] args){
      SArrayList e = new SArrayList();
      e.addElt(6);
      e.addElt(2);
      e.display();
      e.changeElt(5,1);
      System.out.println(e.getLength());
      e.display();
      
  }
}
