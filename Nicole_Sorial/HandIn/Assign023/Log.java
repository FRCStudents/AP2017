import java.io.*;

public class Log {

	public static final String init = "This file has been initialized\n";
	public static final String init_prop = "Our file was initialized properly\n";
	public static final String read_prop = "Our file was read properly\n";
	public static int log_counter = 1;
	public static FileInputStream status = null;
	public static FileOutputStream make_status = null;
	public static FileOutputStream log = null;

	public static void doIt() throws IOException {
		try {
			status = new FileInputStream("./Status.txt");
			DataInputStream status_data = new DataInputStream(status);
			BufferedReader status_reader = new BufferedReader(new InputStreamReader(status_data));
			String str;
			while ((str = status_reader.readLine()) != null) {
				System.out.println(str);
			}
			status.close();

			log = new FileOutputStream("./log" + log_counter + ".txt");
			log_counter++;
			for (int i = 0; i < read_prop.length(); i++) {
				log.write(read_prop.charAt(i));
			}
			log.close();
		}
		catch (FileNotFoundException e) {
			make_status = new FileOutputStream("./Status.txt");
			for (int i = 0; i < init.length(); i++) {
				make_status.write(init.charAt(i));
			}
			make_status.close();
			
			log = new FileOutputStream("./log" + log_counter + ".txt");
			log_counter++;
			for (int i = 0; i < init_prop.length(); i++) {
				log.write(init_prop.charAt(i));
			}
			log.close();
		}
	}

	public static void main(String[] argv) throws IOException {
		doIt();
		doIt(); // to ensure counter works
	}
}