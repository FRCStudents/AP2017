abstract class AC {
	int ac;
	int b;

	abstract void turnOnAC();

	abstract void turnOffAC();

	public int getAC() {
		return ac;
	}

	public void putInBox(){
		System.out.print("******\n**" + ac + "**\n******\n");
	}
	public String toString() {
		return "" + getAC();
	}
}
