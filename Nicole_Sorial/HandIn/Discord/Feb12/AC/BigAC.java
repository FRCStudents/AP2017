public class BigAC extends AC {

	protected void turnOnAC() {
		AC = 10;
	}

	protected void turnOffAC() {
		AC = -10;
	}

	public String toString() {
		return "AC: " + String.valueOf(AC);
	}
}