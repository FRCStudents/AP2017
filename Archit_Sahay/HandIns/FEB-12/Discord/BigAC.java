
public class BigAC extends AC {
	public BigAC(){
		thing1 = -10;
	}

	public void turnOnAC(){
		thing1 = 10;
	}

	public void turnOffAC(){
		thing1 = -10;
	}

	public String toString(){
		return "This is the AC: " + thing1;
	}
}	