public abstract class AC{

protected int a;
protected int b;

protected abstract void turnOnAC();
protected abstract void turnOffAC();

public int getAC(){
	return a;
}

public void putInBox(){
	System.out.println("*************");
	System.out.println("*	    *");
	System.out.println("*    " + a + "    *");
	System.out.println("*	    *");
	System.out.println("*************");
}

public void SetAC(int x){
	a = x;
}

}