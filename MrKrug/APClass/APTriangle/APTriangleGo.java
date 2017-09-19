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
    sendIt("Area: " + apTriangle.getArea());
    sendIt("Angle A: " + apTriangle.getAngleA());
    sendIt("Angle B: " + apTriangle.getAngleB());
    sendIt("Angle C: " + apTriangle.getAngleC());

    APTriangle apTriangle2 = new APTriangle(4,5,6);
    sendIt("Perimeter: " + apTriangle2.getPerimeter());
    sendIt("Right: " + apTriangle2.isRight());
    sendIt("Area: " + apTriangle2.getArea());
    sendIt("Angle A: " + apTriangle2.getAngleA());
    sendIt("Angle B: " + apTriangle2.getAngleB());
    sendIt("Angle C: " + apTriangle2.getAngleC());
  }
}
