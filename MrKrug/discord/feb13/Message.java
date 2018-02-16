
public abstract class Message {
	String message;
	public abstract void showMessage();

	public void putInBox(){
		System.out.println("\n*****************");
		System.out.println("**             **");
		System.out.println("**     " + AC);
		System.out.println("**             **");
		System.out.println("*****************\n");
	}


	public String getMessage(){
		return message;
	}
}
