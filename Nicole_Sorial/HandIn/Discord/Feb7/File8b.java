public class File8b {

	private int att;

	public void setAtt(int a) {
		att = a;
	}

	public File8b(int a) {
		setAtt(a);
	}

	public File8b() {
		this(17);
	}

	public String toString() {
		return String.valueOf(att);
	}

	public static void main(String[] argv) {
		File8b f = new File8b();
		File8b g = new File8b(5);

		System.out.println("Default constructor:\n" + f);
		System.out.println("\nConstructor parameter of 5:\n" +g);
	}
}