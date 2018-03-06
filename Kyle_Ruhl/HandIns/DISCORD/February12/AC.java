public abstract class AC{
	int AC;


public abstract void turnOnAC();
public abstract void turnOffAC();

public int getAC(){
	return AC;
}

public void putInBox(){
	System.out.println("*************");
	System.out.println("*	    *");
	System.out.println("*    " + AC + "    *");
	System.out.println("*	    *");
	System.out.println("*************");
}

public void SetAC(int a){
	AC = a;
}

}
