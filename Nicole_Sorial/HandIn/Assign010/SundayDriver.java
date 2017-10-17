class SundayDriver {

	public static void main(String[] argv) {
		Sunday s = new Sunday();
		for (int i = 1; i < 5; i++) {
			s.moveCarRight();
			s.moveCarLeft();
		}
	}
}