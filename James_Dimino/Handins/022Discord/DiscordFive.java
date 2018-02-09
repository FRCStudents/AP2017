public class DiscordFive {

	static boolean result;

	public static void functionOne() {
		if (result == true) {
			System.out.println("Whew");
		}

		else {
			System.out.println("Drag");
		}
	}

	public static boolean functionTwo(String s) {
		s = s.toLowerCase();
		char z = s.charAt(0);
			if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
				System.out.println("functionTwo: Returned True");
				result = true;
				return true;
			}

			else {
				System.out.println("functionTwo: Returned False");
				result = true;
				return false;
			}
	}
	public static void main(String[] argv){

	functionTwo("Alpha");

	functionOne();

	}
}