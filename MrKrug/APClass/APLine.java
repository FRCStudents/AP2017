package APLine;

public class APLine{
  private int a;
  private int b;
  private int c;

  public APLine(int a, int b, int c){
      this.a = a;
      this.b = b;
      this.c = c;
  }

  public boolean isOnLine(int x, int y){
      int hold = (a * x) + (b * y) + c;
      if (hold == 0){
        return true;
      }
      return false;
  }

  public double getSlope(){
    return -1 * (double)a/(double)b;
  }
}
