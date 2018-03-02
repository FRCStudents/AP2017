public class VeryBigAC extends AC {

	public VeryBigAC(){
		attribute1 = -100;
	}

	protected void turnOnAC(){
		attribute1 = 100;
	}

	protected void turnOffAC(){
	attribute1 = -100;
	}

	public String toString(){
		return "Very Big AC value: " + attribute1; 
	}

}