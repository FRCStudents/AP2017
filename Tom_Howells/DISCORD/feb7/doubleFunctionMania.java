class doubleFunctionMania {
	public static void main(String[] args) {
		function1("ding");
		function1("whop");
		function1("aaaa");
	}
	public static void function1(String s) {
		if(function2(s)) {
			System.out.println("whew");
		} else {
			System.out.println("drag");
		}
	}
	public static boolean function2(String s) {
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
}