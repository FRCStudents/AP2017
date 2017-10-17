public class APLine{
	private	int a;
	private int b;
	private	int c;
public APLine(int a1,int b1, int c1) {
	a=a1;
	b=b1;
	c=c1;
}
public double getSlope()
  {
    return -(double)a / b; 2
  }

public boolean isOnLine(int x, int y)
  {
    return a*x + b*y + c == 0;
  }
}
