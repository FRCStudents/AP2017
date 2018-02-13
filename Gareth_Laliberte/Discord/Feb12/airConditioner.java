public abstract class airConditioner{
	
	protected int airConditioner = 0;
	protected int b = 1;

	protected abstract void turnOnAC();

	protected abstract void turnOffAC();

	public void setTemp(int x){
		airConditioner = x;
	}

	public void putInBox(){
		System.out.println("\n*******");
		System.out.println("*  " + airConditioner + "  *");
		System.out.println("*******\n");
	}
}
