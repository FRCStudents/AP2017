import java.util.Random;

public class Testing {
	private static String lol = "a";

	public static void main(String[] args) {
		Random rgen = new Random();
		for(int i = 0; i <= 100; i++){
			int x = rgen.nextInt(5);
			System.out.println(x);
		}
	}
}