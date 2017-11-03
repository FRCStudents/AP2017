public class APLineDriver {

  public static void main(String[] args) {
  
    APLine line1 = new APLine();
    double slope1 = line1.getSlope();
    boolean onLine1 = line1.isOnLine(5,-2);
    System.out.println("The slope is " + slope1 + "\n And Point 5, -2 being on the line is " + onLine1);
  }
}