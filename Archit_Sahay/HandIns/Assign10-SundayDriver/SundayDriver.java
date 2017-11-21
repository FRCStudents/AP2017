public class SundayDriver {

	private	String forward_car = " _________\n"
	 						   + " ||_| |_|  )___\n"
							   + " |  _      _   )]\n"
							   + " `-(O)----(O)--\n";
	private String space = " ";

	private String backward_car = "      ________\n"
	 							 + "  ___( |_| |_||\n"
	 							 + " (  _      _  |\n"
								 + " '-(O)----(O)-'\n";
	private String bspace = space;


	void Car() {
		String forward_car = " _________\n"
	 					   + " ||_| |_|  )___\n"
						   + " |  _      _   )]\n"
						   + " `-(O)----(O)--\n";
	 	String space = " ";
	 	String backward_car = "      ________\n"
	 						 + "  ___( |_| |_||\n"
	 						 + " (  _      _  |\n"
							 + " '-(O)----(O)-'\n";
	 	String bspace = space;
	 	
	}

	public void newScreen() {
		for(int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

	public void waitUp() {
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void goingForward() {
		for (int i = 0; i < 80; i++) {
			space = space + " ";
			newScreen();
			System.out.println(space + forward_car);
			waitUp();
		}
		bspace = space;
		space = " ";
	}

	public void moveBackwards() {
		for (int i = 0; i < 80; i++) {
			if (bspace.length() >= 2) {
				bspace = bspace.substring(1);
			}
			newScreen();
			System.out.println(bspace + backward_car);
			waitUp();
		}
		bspace = space;
	}
}
