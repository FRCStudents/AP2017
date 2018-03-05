public class LittleAC extends AC {

	public LittleAC(){
		one = 0;
	}

	protected void turnOnAC(){
		one = 1;
	}

	protected void turnOffAC(){
		one = 0;
	}

	public String toString(){
		return "LittleAC: " + one;
	}
}

