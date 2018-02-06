import java.io.*;
public class MushIntoOne {

	private static File file = null;
	private static String[] paths;
	private static FileInputStream in = null;
	private static FileOutputStream out = null;

	public static void main(String[] argv) throws IOException {
		file = new File("./People/");
		paths = file.list();
		out = new FileOutputStream("./All.pls");

		for(String path:paths) {
			in = new FileInputStream("./People/" + path);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}

		out.close();
	}
}