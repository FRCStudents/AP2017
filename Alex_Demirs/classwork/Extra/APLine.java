public class APLine{

private int a;
private int b;
private int c;


public int getA(){
	return a;
}
public void setA(int newA){
	a = newA;
}
public int getB(){
	return b;
}
public void setB(int newB){
	b = newB;
}
public int getC(){
	return c; 
}
public void setC(int newC){
	c = newC;
}
	




public double getSlope(){
	return (double) -a/b;
}



public boolean isOnLine(int x, int y){
		if(((a * x) + (b * y) ))
}
}