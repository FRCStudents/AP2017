public class File5 {

	public static void react(String s) {
		if (vowel(s)) {
			System.out.println("whew");
		} else {
			System.out.println("drag");
		}
	}

	public static boolean vowel(String s) {
		if (s.charAt(0) == 'a' || s.charAt(0) == 'A') {
			return true;
		} else if (s.charAt(0) == 'e' || s.charAt(0) == 'E') {
			return true;
		} else if (s.charAt(0) == 'i' || s.charAt(0) == 'I') {
			return true;
		} else if (s.charAt(0) == 'o' || s.charAt(0) == 'O') {
			return true;
		} else if (s.charAt(0) == 'u' || s.charAt(0) == 'U') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] argv) {

		System.out.println("If parameter is \"Dog\":");
		react("Dog");
		System.out.println("\nIf parameter is \"Apple\":");
		react("Apple");
	}
}