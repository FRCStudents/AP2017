public class VeryBigAC extends AC {
	
	public VeryBigAC(){
		thing1 = -100;
	}

	public void turnOnAC(){
		thing1 = 100;
	}

	public void turnOffAC(){
		thing1 = -100;
	}

	public String toString(){
		return "This is the AC: " + thing1;
	}
}