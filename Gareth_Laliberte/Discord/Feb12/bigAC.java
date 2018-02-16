abstract class bigAC extends airConditioner{

	protected void turnOnAC() {
		airConditioner = 10;
	}

	protected void turnOffAC() {
		airConditioner = -10;
	}

	public String toString() {
		return "The AC is set at: " + String.valueOf(airConditioner);
	}
}