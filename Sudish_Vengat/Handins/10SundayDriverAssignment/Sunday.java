public class Sunday {

	private	String forward_car1 = " _________";
	private String forward_car2 = " ||_| |_|\\___";
	private String forward_car3 = " |  _      _ \\";
	private String forward_car4 = " `-(O)----(O)-'";
	private String space = " ";

	private String backward_car1 = "     ________";
	private String backward_car2 = " ___/ |_| |_||";
	private String backward_car3 = "/  _      _  |";
	private String backward_car4 = "'-(O)----(O)-'";
	private String bspace = space;


	Sunday() {
		String forward_car1 = " _________";
		String forward_car2 = " ||_| |_|\\___";
		String forward_car3 = " |  _      _ \\";
		String forward_car4 = " `-(O)----(O)-'";
		String space = " ";
		String backward_car1 = "     ________";
		String backward_car2 = " ___/ |_| |_||";
		String backward_car3 = "/  _      _  |";
		String backward_car4 = "'-(O)----(O)-'";
		String bspace = space;
	}

	public void eraseScreen() {
		for(int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

	public void waitUp() {
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void moveForwards() {
		for (int i = 0; i < 80; i+=3) {
			space = space + " ";
			eraseScreen();
			System.out.println(space + forward_car1);
			System.out.println(space + forward_car2);
			System.out.println(space + forward_car3);
			System.out.println(space + forward_car4);
			waitUp();
		}
		bspace = space;
		space = " ";
	}

	public void moveBackwards() {
		for (int i = 0; i < 80; i+=3) {
			if (bspace.length() >= 2) {
				bspace = bspace.substring(1);
			}
			eraseScreen();
			System.out.println(bspace + backward_car1);
			System.out.println(bspace + backward_car2);
			System.out.println(bspace + backward_car3);
			System.out.println(bspace + backward_car4);
			waitUp();
		}
		bspace = space;
	}


}