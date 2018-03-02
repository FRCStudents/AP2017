public abstract class AC {

	protected int one;
	protected int two;

	protected abstract void turnOnAC();
	protected abstract void turnOffAC();

	public int getAC(){
		return one;
	}

	public void setAC(int x){
		one = x;
	}

	public void putInBox(){
		System.out.println("*******");
		System.out.println("* " + one + " *");
		System.out.println("*******");
	}
}