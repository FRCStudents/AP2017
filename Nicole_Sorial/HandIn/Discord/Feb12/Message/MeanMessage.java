public class MeanMessage extends Message {

	public MeanMessage() {
		sayThing();
	}

	public void sayThing() {
		message = "This is a mean message, grr";
		// System.out.println(message);
	}

	public String toString() {
		return message;
	}
}