public class BigAC extends AC {

	public BigAC(){
		one = -10;
	}

	protected void turnOnAC(){
		one = 10;
	}

	protected void turnOffAC(){
		one = -10;
	}

	public String toString(){
		return "BigAC: " + one;
	}
}