public class APLine {
  private int a;
  private int b;
  private int c;

  public APLine(int newA, int newB, int newC) {
    a = newA;
    b = newB;
    c = newC;
  }

  public int getA() {
    return a;
  }
  public void setA(int newValue){
    a = newValue;
  }
  public int getB() {
    return b;
  }
  public void setB(int newValue){
    b = newValue;
  }
  public int getC() {
    return c;
  }
  public void setC(int newValue){
    c = newValue;
  }
  public double getSlope(){
    return (double)-a/b;
  }
  public boolean isOnLine(int x, int y){
    return (a*x) + (b*y) + c == 0;
  }

}
