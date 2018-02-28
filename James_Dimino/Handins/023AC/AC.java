public abstract class AC {

	protected int attribute1;
	protected int attribute2;

	protected abstract void turnOnAC();
	protected abstract void turnOffAC();

	public int getAC(){
		return attribute1;
	}

	public void putInBox(){
		System.out.println("*************");
		System.out.println("*	    *");
		System.out.println("*    " + attribute1 + "    *");
		System.out.println("*	    *");
		System.out.println("*************");
	}

	public void SetAC(int a){
		attribute1 = a;
	}

}