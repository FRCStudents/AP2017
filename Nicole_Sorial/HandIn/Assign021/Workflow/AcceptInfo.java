import java.util.*;
import java.io.*;

public class AcceptInfo {

	private static String name;
	private static int speed;
	private static int age;
	private static String occupation;
	private static int height; // in inches
	private static int shoe_size;
	private static int hat_size;

	private static int stop = 0;
	public static Scanner s = new Scanner(System.in);

	public static void setStop(int x) {
		stop = x;
	}

	public static void start() {
		String input;
		System.out.println("\nWelcome. Enter your name or enter 2 to end");
		input = s.nextLine();
		if (input.equals(Integer.toString(2))) {
			setStop(1);
		} else {
			name = input;
		}
	}

	public static void prompt() { // didn't use nextInt() because mixing it with nextLine() made it skip randomly
		System.out.println("\nPlease enter your speed.");
		speed = Integer.parseInt(s.nextLine());

		System.out.println("\nPlease enter your age.");
		age = Integer.parseInt(s.nextLine());
		
		System.out.println("\nPlease enter your occupation.");
		occupation = s.nextLine();

		System.out.println("\nPlease enter your height in inches.");
		height = Integer.parseInt(s.nextLine());

		System.out.println("\nPlease enter your shoe size.");
		shoe_size = Integer.parseInt(s.nextLine());

		System.out.println("\nPlease enter your hat size.");
		hat_size = Integer.parseInt(s.nextLine());
	}

	public static void main(String[] argv) throws IOException {

		start();
		for (int i = stop; i == 0; i = stop) {
			prompt();

			// creating new file
			FileOutputStream out = new FileOutputStream("./People/" + name + ".pls");
			String data = name + "|" + speed + "|" + age + "|" + occupation + "|" + height + "|" + shoe_size + "|" + hat_size + "*";

			// writing new file
			for (int j = 0; j < data.length(); j++) {
				out.write(data.charAt(j));
			}
			out.close();

			// repeat
			start();
		}
		setStop(0); // to reset for future use

		RunMe.main(null);
	}
}