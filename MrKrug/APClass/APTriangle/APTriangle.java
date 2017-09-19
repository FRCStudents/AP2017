package APShape;

public class APTriangle {
  private int a;
  private int b;
  private int c;

  public APTriangle(){
      this(3,4,5);
  }

  /*
   * Note: Angle C is opposite site c... etc
   */
  public double getAngleC(){
    double cosC = (double)((a * a) + (b * b) - (c * c))/(double)(2 * a * b);
    return Math.toDegrees(Math.acos(cosC));
  }

  /*
   * Note: Angle A is opposite site a... etc
   */
  public double getAngleA(){
    double cosA = (double)((b * b) + (c * c) - (a * a))/(double)(2 * b * c);
    return Math.toDegrees(Math.acos(cosA));
  }

  /*
   * Note: Angle B is opposite site b... etc
   */
  public double getAngleB(){
    double cosB = (double)((c * c) + (a * a) - (b * b))/(double)(2 * c * a);
    return Math.toDegrees(Math.acos(cosB));
  }

  public APTriangle(int a, int b, int c){
      this.a = a;
      this.b = b;
      this.c = c;
      if (!val(a,b,c)){
        System.out.println("APTriangle doesn't work! Crash and Burn!");
      }
  }

  public int getArea(){
    int p = getPerimeter();
    int area = (p * (p - a) * (p - b) * (p - c));
    return (int)Math.sqrt(area);
  }

  public boolean isIsosceles(){
    if(a == b) return true;
    if(b == c) return true;
    if(a == c) return true;
    return false;
  }

  public String isRight(){
    if (isRightCheck()){
      return "yes";
    }
    return "no";
  }

  private boolean isRightCheck(){
      return Math.sqrt((a * a) + (b * b)) == c;
  }

  private boolean val(int a, int b, int c){
    if ((a <= 0) || (b <= 0) || (c <= 0)) return false;
    if ((a + b) < c){
      return false;
    }
    if ((b + c) < a){
      return false;
    }
    if ((a + c) < b){
      return false;
    }
    return true;
  }

  public int getPerimeter(){
    return a + b + c;
  }
}
