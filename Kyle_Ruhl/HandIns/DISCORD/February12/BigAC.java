public class BigAC extends AC{

public BigAC(){
attribute1 = -10;
}

//@overide
protected void turnOnAC(){
attribute1 = 10;
}

//@overide
protected void turnOffAC(){
attribute1 = -10;
}

public String toString(){
return "Big AC value: " + attribute1; 
}

}
