/* Node */
package aiNet;

import java.util.Random;

public class Node {
  private int rNum;
  private int FIRE_WEIGHT;
  private boolean fired = false;
  private int fireCount = 0;

  private int MAX_FIRE = 2;

  public Node(){
    this(500);
  }

  public Node(int fWeight){
    FIRE_WEIGHT = fWeight;
    rNum = randInt(1, 1000);
  }

  public int getRNum(){
    return rNum;
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
      }
      if(rNum > FIRE_WEIGHT){
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
