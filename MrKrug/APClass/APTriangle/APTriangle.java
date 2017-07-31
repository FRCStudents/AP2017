package APShape;

public class APTriangle {
  private int a;
  private int b;
  private int c;

  public APTriangle(){
      this(3,4,5);
  }

  public APTriangle(int a, int b, int c){
      this.a = a;
      this.b = b;
      this.c = c;
      if (!val(a,b,c)){
        System.out.println("APTriangle doesn't work! Crash and Burn!");
      }
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
