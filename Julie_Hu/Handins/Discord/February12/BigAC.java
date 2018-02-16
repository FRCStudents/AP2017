public class BigAC extends AC{

public BigAC(){
	a = -10;
}

protected void turnOnAC(){
	a = 10;
}

protected void turnOffAC(){
	a = -10;
}

public String toString(){
return "The Big AC value: " + a; 
}

}