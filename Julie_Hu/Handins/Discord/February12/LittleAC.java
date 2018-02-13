public class LittleAC extends AC{
	protected void turnOnAC() {
		a = 1;
	}

	protected void turnOffAC() {
		a = 0;
	}

	public String toString() {
		return "AC: " + String.valueOf(a);
	}

}
