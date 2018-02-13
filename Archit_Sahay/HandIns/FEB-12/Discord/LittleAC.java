public class  LittleAC extends AC{

	protected void turnOnAC(){
		thing1 = 1;
	}

	protected void turnOffAC(){
		thing1 = 0;
	}

	
	public String toString() {
		return "AC: " + String.valueOf(thing1);
	}
}
