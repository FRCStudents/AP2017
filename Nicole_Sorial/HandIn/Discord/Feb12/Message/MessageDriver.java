public class MessageDriver {
	public static void main(String[] argv) {

		// Testing MeanMessage
		MeanMessage m = new MeanMessage();
		System.out.println("Mean Message:");
		m.sayThing();
		System.out.println("toString(): " + m);
		m.putInBox();

		System.out.println("\n");

		// ==============================
		// Testing NiceMessage
		NiceMessage n = new NiceMessage();
		System.out.println("Nice Message:");
		n.sayThing();
		System.out.println("toString(): " + n);
		n.putInBox();

		System.out.println("\n");

		// ==============================
		// Testing AbusiveMessage
		AbusiveMessage a = new AbusiveMessage();
		System.out.println("Abusive Message:");
		a.sayThing();
		System.out.println("toString(): " + a);
		a.putInBox();

		System.out.println("\n");

		// ==============================
		// Testing Conversation
		Conversation c = new Conversation();
		System.out.println("Conversation:");
		c.showConversation();
	}
}