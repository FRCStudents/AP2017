public abstract class Message {

	protected String message;

	protected abstract void sayThing();

	public String getMessage() {
		return message;
	}
	public void putInBox() {
		int a = message.length();

		for (int i = 0; i < a + 4; i++) {
			System.out.print("*");
		}
		System.out.print("\n* ");
		for (int i = 0; i < a; i++) {
			System.out.print(" ");
		}
		System.out.println(" *");
		System.out.println("* " + message + " *");
		System.out.print("* ");
		for (int i = 0; i < a; i++) {
			System.out.print(" ");
		}
		System.out.println(" *");
		for (int i = 0; i < a + 4; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

// Message ---> NiceMessage
// 		   ---> MeanMessage ---> AbusiveMessage