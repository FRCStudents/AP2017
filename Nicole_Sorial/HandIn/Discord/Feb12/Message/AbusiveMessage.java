public class AbusiveMessage extends MeanMessage {

	public AbusiveMessage() {
		sayThing();
	}

	public void sayThing() {
		message = "This is an abusive message, afdhkjfaldhalk";
		// System.out.println(message);
	}

	public String toString() {
		return message;
	}
}