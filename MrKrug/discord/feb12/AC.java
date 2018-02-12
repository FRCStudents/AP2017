
public abstract class AC {
	int AC;
	public abstract void turnOnAC();
	public abstract void turnOffAC();

	public void putInBox(){
		System.out.println("\n*****************");
		System.out.println("**             **");
		System.out.println("**     " + AC);
		System.out.println("**             **");
		System.out.println("*****************\n");
	}


	public int getAC(){
		return AC;
	}
}
