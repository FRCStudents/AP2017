class divBy6 {
	public static void main(String[] args) {
		divQuestionMark(7);
		divQuestionMark(600);
	}

	public static void divQuestionMark(int param) {
		System.out.println(param + "?");
		if (param % 6 == 0) {
			System.out.println("\tHah ha 6-divisor dude");
		} else {
			System.out.println("\t(Bummer and a half)");
		}
	}
}