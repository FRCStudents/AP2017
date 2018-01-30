class SundayDriver {

	public static void main(String[] argv) {
		SundayCar s = new SundayCar();
		for (int i = 1; i < 5; i++) {
			s.goRight();
			s.goLeft();
		}
	}
}