public class LittleAC extends AC{

public LittleAC(){
AC = 0;
}

	
//@overide
public void turnOnAC(){
AC = 1;
}

//@overide
public void turnOffAC(){
AC = 0;
}

public String toString(){
	return "Little AC value: " + AC;
}
}
