public abstract class AC {

	protected int AC;
	protected int b;

	protected abstract void turnOnAC();
	protected abstract void turnOffAC();

	public int getAC() {
		return AC;
	}

	public void setAC(int x) {
		AC = x;
	}

	public void putInBox() {
		System.out.println("*****");
		System.out.println("* " + AC + " *");
		System.out.println("*****");
	}
}