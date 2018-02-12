public class VeryBigAC extends AC{

public VeryBigAC(){
attribute1 = -100;
}

	
//@overide
protected void turnOnAC(){
attribute1 = 100;
}

//@overide
protected void turnOffAC(){
attribute1 = -100;
}

public String toString(){
return "Very Big AC value: " + attribute1; 
}

}
