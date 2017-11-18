class SundayDriverDriver {

	public static void main(String[] argv) {
		
		SundayDriver x = new SundayDriver();

		for (int i = 3; i < 8; i++) {
			
			x.Forwards();
			x.Backwards();
				System.out.println("It's now Monday :(");
		}		
	}
}