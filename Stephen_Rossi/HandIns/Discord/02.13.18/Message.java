public abstract class Message {
	String message;

	abstract void sayThing();

	public String getMessage(){
		return message;
	}
	public void putInBox(){
		System.out.print("**********\n* "+message+"\n**********");
	}
}