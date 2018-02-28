public class LittleAC extends AC {

	public LittleAC(){
		attribute1 = 0;
	}

	protected void turnOnAC(){
		attribute1 = 1;
	}


	protected void turnOffAC(){
		attribute1 = 0;
	}

	public String toString(){
		return "Little AC value: " + attribute1;
	}
	
}