
public class VeryBigAC extends AC {
	public VeryBigAC(){
		AC = -100;
	}

	public void turnOnAC(){
		AC = 100;
	}

	public void turnOffAC(){
		AC = -100;
	}

	public String toString(){
		return "This is the AC: " + AC;
	}
}
