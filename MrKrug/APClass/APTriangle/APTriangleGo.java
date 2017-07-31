package APShape;
import APShape.APTriangle;

public class APTriangleGo{
  private static void sendIt(String s){
    System.out.println(s);
  }

  public static void main(String args[]){
    APTriangle apTriangle = new APTriangle(3,4,5);
    sendIt("Perimeter: " + apTriangle.getPerimeter());
    sendIt("Right: " + apTriangle.isRight());

    APTriangle apTriangle2 = new APTriangle(4,5,6);
    sendIt("Perimeter: " + apTriangle2.getPerimeter());
    sendIt("Right: " + apTriangle2.isRight());
  }
}
