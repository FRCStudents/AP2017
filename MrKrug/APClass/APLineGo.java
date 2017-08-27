package APLine;
import APLine.APLine;

public class APLineGo{
  public static void main(String args[]){
    APLine apLine = new APLine(3,4, -25);
    System.out.println("Is on line: " + apLine.isOnLine(3,4));
    System.out.println("Slope: " + apLine.getSlope());
  }
}
