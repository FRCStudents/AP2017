
public class BigAC extends AC {
	public BigAC(){
		AC = -10;
	}

	public void turnOnAC(){
		AC = 10;
	}

	public void turnOffAC(){
		AC = -10;
	}

	public String toString(){
		return "This is the AC: " + AC;
	}
}
