public class BigAC extends AC{

public BigAC(){
AC = -10;
}

//@overide
public void turnOnAC(){
AC = 10;
}

//@overide
public void turnOffAC(){
AC = -10;
}

public String toString(){
return "Big AC value: " + AC; 
}

}
