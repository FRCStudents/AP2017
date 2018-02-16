public class VeryBigAC extends AC{

public VeryBigAC(){
	a= -100;
}

protected void turnOnAC(){
	a = 100;
}

protected void turnOffAC(){
	a = -100;
}

public String toString(){
	return "Very Big AC value: " + a; 
}

}
