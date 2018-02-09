public class File8a {

	private  int att;

	public  void setAtt(int s) {
		att = s;
	}

	public File8a() {
		setAtt(17);
	}

	public String toString() {
		return String.valueOf(att);
	}

	public static void main(String[] argv) {

		File8a f = new File8a();
		System.out.println(f);

	}
}