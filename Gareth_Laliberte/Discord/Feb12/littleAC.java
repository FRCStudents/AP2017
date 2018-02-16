abstract class littleAC extends airConditioner{
	
	protected int a;
	protected int b;

	protected void turnOnAC() {
			a = 1;
		}

	protected void turnOffAC(){
			a = 0;
		}

	public String toString() {
		return "The AC is set at: " + String.valueOf(airConditioner);
	}
}