class SundayDriverDriver {

	public static void main(String[] argv) {
		SundayDriver s = new SundayDriver();
		for (int i = 1; i < 100; i+=5) {
			s.moveForward();
			s.moveBackward();
		}
	
	System.out.println("It's now Monday :(");
}
}