public class VeryBigAC extends AC {

	public VeryBigAC(){
		one = -100;
	}

	protected void turnOnAC(){
		one = 100;
	}

	protected void turnOffAC(){
		one = -100;
	}

	public String toString(){
		return "VeryBigAC: " + one;
	}
}