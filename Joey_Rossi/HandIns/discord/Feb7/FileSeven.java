	class FileSeven {

	private int att;

	public void setAtt(int a) {
		att = a;
	}

	public FileSeven(int a) {
		setAtt(a);
	}

	public FileSeven() {
		this(17);
	}

	public String toString() {
		return "att = " + att;
	}

	public static void main(String[] argv) {
		FileSeven f = new FileSeven();
		FileSeven g = new FileSeven(5);

		System.out.println("Default constructor:\n" + f);
		System.out.println("\nConstructor parameter of 5:\n" +g);
	}
}