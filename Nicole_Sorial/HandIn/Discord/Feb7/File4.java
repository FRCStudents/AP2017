public class File4 {

	public static void divisible(int s) {

		if (s%6 == 0) {
			System.out.println("Hah ha 6-divisor dude.");
		} else {
			System.out.println("(Bummer and a half)");
		}
	}

	public static void main(String[] argv) {

		System.out.println("Parameter of 1:");
		divisible(1);
		System.out.println("\nParameter of 12:");
		divisible(12);


	}
}