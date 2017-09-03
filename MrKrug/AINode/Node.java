/* Node */
package aiNet;

import java.util.Random;

public class Node {
  static int creationOrder = 0;
  private int rNum;
  private int oNum;

  private int FIRE_WEIGHT;
  private int NETWORK_SIZE;

  private boolean fired = false;
  private int fireCount = 0;

  private int MAX_FIRE = 2;

  public Node(){
    this(500, 1000);
  }

  public Node(int fWeight){
    this(fWeight, 1000);
  }

  public Node(int fWeight, int netSize){
    FIRE_WEIGHT = fWeight;
    NETWORK_SIZE = netSize;
    oNum = creationOrder;
    rNum = randInt(1, NETWORK_SIZE);
    creationOrder++;
  }

  public int getRNum(){
    return rNum;
  }

  public int getOrder(){
    return oNum;
  }

  public boolean hasEverFired(){
      if(fireCount > 0) return true;
      return false;
  }

  public boolean hasFired(){
      //System.out.println("Firing: " + rNum + "/" + fired);
      return fired;
  }

  /* node can only fire MAX_FIRE times */

  public void tryToFire(){
      if(fireCount > MAX_FIRE){
        fired = false;
        return;
      }
      if(rNum < FIRE_WEIGHT){
          fired = true;
          fireCount++;
        }
      else {
          fired = false;
      }
  }

  private int randInt(int min, int max) {
      Random rand = new Random();
      return rand.nextInt((max - min) + 1) + min;
  }
}
