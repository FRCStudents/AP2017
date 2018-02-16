
public class LittleAC extends AC {
	public LittleAC(){
		AC = 0;
	}

	public void turnOnAC(){
		AC = 1;
	}

	public void turnOffAC(){
		AC = 0;
	}

	public String toString(){
		return "This is the AC: " + AC;
	}
}
