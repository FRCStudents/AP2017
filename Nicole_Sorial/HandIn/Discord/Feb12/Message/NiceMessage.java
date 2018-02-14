public class NiceMessage extends Message {

	public NiceMessage() {
		sayThing();
	}

	public void sayThing() {
		message = "This is a nice message!! Woo!!";
		// System.out.println(message);
	}

	public String toString() {
		return message;
	}
}