/* runAI */
package aiNet;
import java.util.Random;
class RunAI {
  /* higher the FIRE_WEIGHT the more likely to fire */
  static int FIRE_WEIGHT = 500;
  static int LIST_SIZE = 1000;

  static private int randInt(int min, int max) {
      Random rand = new Random();
      return rand.nextInt((max - min) + 1) + min;
  }

  public static void runAll(int cycles){
      NodeList nl = new NodeList(FIRE_WEIGHT);

      for(int i=0; i < cycles; i++){
          nl.fireNode(randInt(0, LIST_SIZE - 1));
          nl.showPattern();
          System.out.println("Number nodes fired: " + nl.countFired());
        }
  }

  public static void testNode(){
      Node n1 = new Node();
      Node n2 = new Node();
      System.out.println("Order: " + n1.getOrder());
      System.out.println("Order: " + n2.getOrder());
  }

  public static void main(String [] argv){
      System.out.println("=============== Starting New Run ================");
      runAll(10);
  }
}
