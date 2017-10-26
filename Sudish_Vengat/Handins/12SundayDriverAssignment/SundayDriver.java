class SundayDriver {

	public static void main(String[] argv) {
		
		Sunday s = new Sunday();

		for (int i = 3; i < 8; i++) {
			
			s.moveForwards();
			s.moveBackwards();
				System.out.println("Success!");
		}
	}
}