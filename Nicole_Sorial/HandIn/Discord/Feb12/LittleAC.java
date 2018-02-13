public class LittleAC extends AC {

	protected void turnOnAC() {
		AC = 1;
	}

	protected void turnOffAC() {
		AC = 0;
	}

	public String toString() {
		return "AC: " + String.valueOf(AC);
	}

}