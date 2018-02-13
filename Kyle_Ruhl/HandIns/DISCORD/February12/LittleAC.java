public class LittleAC extends AC{

public LittleAC(){
attribute1 = 0;
}

	
//@overide
protected void turnOnAC(){
attribute1 = 1;
}

//@overide
protected void turnOffAC(){
attribute1 = 0;
}

public String toString(){
	return "Little AC value: " + attribute1;
}
}
