public class File7 {

	private int att;

	public void setAtt(int a) {
		att = a;
	}

	public File7(int a) {
		setAtt(a);
	}

	public File7() {
		this(17);
	}

	public String toString() {
		return "att = " + att;
	}

	public static void main(String[] argv) {
		File7 f = new File7();
		File7 g = new File7(5);

		System.out.println("Default constructor:\n" + f);
		System.out.println("\nConstructor parameter of 5:\n" +g);
	}
}