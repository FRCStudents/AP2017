public abstract class Message {

	protected String message;

	protected abstract void sayThing();

	public String getMessage(){
		return message;
	}

	public void putInBox(){
		System.out.println("**********************");
		System.out.println("*                    *");
		System.out.println("*                    *");
		System.out.println("* " + message + " *");
		System.out.println("*                    *");
		System.out.println("*                    *");
		System.out.println("**********************");
	}
}