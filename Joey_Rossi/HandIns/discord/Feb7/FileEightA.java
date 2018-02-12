public class FileEightA {

	private  int att;

	public  void setAtt(int s) {
		att = s;
	}

	public FileEightA() {
		setAtt(17);
	}

	public String toString() {
		return String.valueOf(att);
	}

	public static void main(String[] argv) {

		FileEightA f = new FileEightA();
		System.out.println(f);

	}
}