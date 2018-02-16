public class NiceMessage extends Message {

	public NiceMessage(){
		message = "What a cool dude!";
	}

	public void sayThing(){
		System.out.println(message);
	}

	public String toString(){
		return message;
	}
}