public class FileEightB {

	private int att;

	public void setAtt(int a) {
		att = a;
	}

	public FileEightB(int a) {
		setAtt(a);
	}

	public FileEightB() {
		this(17);
	}

	public String toString() {
		return String.valueOf(att);
	}

	public static void main(String[] argv) {
		FileEightB f = new FileEightB();
		FileEightB g = new FileEightB(5);

		System.out.println("Default constructor:\n" + f);
		System.out.println("\nConstructor parameter of 5:\n" +g);
	}
}