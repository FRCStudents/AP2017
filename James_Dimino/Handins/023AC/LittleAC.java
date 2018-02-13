public class LittleAC implements AC {
	
	protected int a;
	protected int b;

	public void turnOnAC() {
		a = 1;
		b = 1;
	}

	public void turnOffAc() {
		a = 0;
		b = 0;
	}
}