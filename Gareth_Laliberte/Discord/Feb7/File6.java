public class File6 {

	private  int attrib;

	public  void attribute(int s) {
		attrib = s;
	}

	public  File6() {
		attribute(17);
	}

	public String toString() {
		return "The attribute is " + attrib;
	}

	public static void main(String[] argv) {
		File6 f = new File6();
		System.out.println(f);
	}
}