public class VeryBigAC extends AC{

public VeryBigAC(){
AC = -100;
}

	
//@overide
public void turnOnAC(){
AC = 100;
}

//@overide
public void turnOffAC(){
AC = -100;
}

public String toString(){
return "Very Big AC value: " + AC; 
}

}
