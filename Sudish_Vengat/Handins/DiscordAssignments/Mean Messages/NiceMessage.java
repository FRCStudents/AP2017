public class NiceMessage extends Message {

	public NiceMessage(){
		this.message = "I like Your Shirt!";
	}

	protected void sayThing(){
		System.out.println(message);
	}

	public String toString(){
		return "NiceMessage: " + message;
	}
}