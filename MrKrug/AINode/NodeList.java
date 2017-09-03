/* Node */
package aiNet;
import java.lang.*;

public class NodeList {
  private int LIST_SIZE = 1000;
  private Node[] nodeList = new Node[LIST_SIZE];
  private int currentNode;

  private int TRIAL_SIZE = 40;
  private int FIRE_WEIGHT;
  Node[] stretch = new Node[TRIAL_SIZE + 1];

  public NodeList(){
      this(500);
  }

  public NodeList(int fWeight){
      this(fWeight, 1000);
  }

  public NodeList(int fWeight, int listSize){
      LIST_SIZE = listSize;
      FIRE_WEIGHT = fWeight;
      for(int i=0; i < LIST_SIZE; i++){
        nodeList[i] = new Node(fWeight);
      }
  }

  public int countFired(){
    int everFired = 0;
    for(int i=0; i < LIST_SIZE; i++){
      if(nodeList[i].hasEverFired()){
        everFired++;
      }
    }
    return everFired;
  }

  public void fireNode(int node){
    nodeList[node].tryToFire();
    //System.out.println("Check: " + node + ":" + nodeList[node].hasFired());
    if(nodeList[node].hasFired()){
      //System.out.println("Firing 4 close: " + node + ":" + nodeList[node].hasEverFired());
      tryFourClosest(node);
    }
  }

  public Node getNode(int spot){
    return nodeList[spot];
  }

  private void copyStretch(int first, int last, int target){
      for(int i=first; i<last; i++){
        if(i != target){
          stretch[i - first] = nodeList[i];
        }
      }
  }

  public void sortStretch(int target){
      Node temp;
      for(int i=0; i<TRIAL_SIZE && stretch[i] != null; i++){
        for(int j=i; j<TRIAL_SIZE; j++){
          if(stretch[j] != null && Node.class.equals(stretch[j].getClass()) && Node.class.equals(stretch[i].getClass())){
              if(Math.abs(stretch[i].getRNum() - target) > Math.abs(stretch[j].getRNum() - target)){
                  temp = stretch[i];
                  stretch[i] = stretch[j];
                  stretch[j] = temp;
                }
          }
        }
      }
  }

  private void tryFourClosest(int spot){
      int oneDown = LIST_SIZE - 1;
      int tenDown = LIST_SIZE - 10;
      int first = spot - TRIAL_SIZE;
      int last = 0;

      if (first < 0) first = 0;
      last = first + TRIAL_SIZE;
      if(last > oneDown){
        last = oneDown;
        first = tenDown;
      }
      /* copyStretch removes target */
      copyStretch(first, last, spot);
      sortStretch(nodeList[spot].getRNum());
      for(int i=0; i < TRIAL_SIZE; i++){
        //System.out.println("Trying to fire: " + (first + i) + ":" + stretch[i].getRNum());
        fireNode(first + i);
      }
  }


  public void reSort(){
      Node temp;
      for(int i=0; i<LIST_SIZE; i++){
        for(int j=i; j<LIST_SIZE; j++){
          if(nodeList[i].getRNum() > nodeList[j].getRNum()){
            temp = nodeList[i];
            nodeList[i] = nodeList[j];
            nodeList[j] = temp;
          }
        }
      }
  }

  public void showPattern(){
    String fired = "*";
    String never = "0";
    String fired3 = "@";
    for(int i=0; i<LIST_SIZE; i++){
      if(i % 100 == 0){
        System.out.println("");
      }
      if(nodeList[i].hasEverFired()){
        System.out.print(fired);
      } else {
        System.out.print(never);
      }
    }
    System.out.println("\n---------------------------------------");
  }

  public String toString(){
    String s="";
    for (int i=0; i<LIST_SIZE; i++){
      if(nodeList[i].hasEverFired()){
          s += "[" + i + "," + nodeList[i].getRNum() + ":" + nodeList[i].hasFired() + "]\n";
        }
    }
    return s;
  }

}
