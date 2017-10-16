 import java.util.Random;

public class Testing {
	private static String[] options = {"1", "2", "3","4","5","6"};

	public static void shuffleArray() {
		for(int i = 0; i < options.length; i ++) {
			int s = i + (int)(Math.random() * (options.length - i));

			String temp = options[s];
			options[s] = options[i];
			options[i] = temp;
		}
	}
	public static void main(String[] args) {

		shuffleArray();

		for(int i = 0; i < options.length; i++){
			System.out.print(options[i] + " ");
		}
		System.out.println(" ");
		System.out.println(Math.random());
		double num = .654;
		System.out.println((int)num));
	}
}