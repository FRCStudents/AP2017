public class File5 {

	public static void checkVowel(String s) {
		if (vowel(s)) {
			System.out.println("whew");
		} else {
			System.out.println("drag");
		}
	}

	public static boolean vowel(String s) {
		if (s.charAt(0) == 'a') {
			return true;
		} else if (s.charAt(0) == 'e') {
			return true;
		} else if (s.charAt(0) == 'i') {
			return true;
		} else if (s.charAt(0) == 'o') {
			return true;
		} else if (s.charAt(0) == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] argv) {
		System.out.println("If parameter is \"bizbappo\":");
		checkVowel("bizbappo");
		System.out.println("\nIf parameter is \"uwu\":");
		checkVowel("uwu");
	}
}