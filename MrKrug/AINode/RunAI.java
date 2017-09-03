/* runAI */
package aiNet;
import java.util.Random;
class RunAI {
  static int FIRE_WEIGHT = 200;

  static private int randInt(int min, int max) {
      Random rand = new Random();
      return rand.nextInt((max - min) + 1) + min;
  }

  public static void main(String [] argv){
        NodeList nl = new NodeList(FIRE_WEIGHT);
          nl.fireNode(randInt(1, 10000));
	        nl.showPattern();
          System.out.println("Number nodes fired: " + nl.countFired());

          nl.fireNode(randInt(1, 10000));
	        nl.showPattern();
          System.out.println("Number nodes fired: " + nl.countFired());

          nl.fireNode(randInt(1, 10000));
	        nl.showPattern();
          System.out.println("Number nodes fired: " + nl.countFired());

          nl.fireNode(randInt(1, 10000));
          nl.showPattern();
          System.out.println("Number nodes fired: " + nl.countFired());
  }
}
