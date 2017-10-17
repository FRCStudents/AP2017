class Sunday {

	// Attributes
	private String car1 = "  ______";
	private String car2 = " /|_||_\\`.__";
	private String car3 = "(   _    _ _\\ ";
	private String car4 = "=`-(_)--(_)-'";
	private String space = " ";

	private String bcar1 = "     _______";
	private String bcar2 = " __.'//_||_|\\";
	private String bcar3 = "/_ _    _    )";
	private String bcar4 = "'-(_)--(_)-'=";
	private String bspace = space;


	// Constructor
	Sunday() {
		String car1 = "  ______";
		String car2 = "/|_||_\\`.__";
		String car3 = "(   _    _ _\\ ";
		String car4 = "=`-(_)--(_)-'";
		String space = " ";
		String bcar1 = "     _______";
		String bcar2 = " __.'//_||_|\\";
		String bcar3 = "/_ _    _    )";
		String bcar4 = "'-(_)--(_)-'=";
		String bspace = space;
	}

	// Methods
	public void eraseScreen() {
		for(int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

	public void waitUp() {
		try {
			Thread.sleep(50);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void moveCarRight() {
		for (int i = 0; i < 499; i+=3) {
			space = space + " ";
			eraseScreen();
			System.out.println(space + car1);
			System.out.println(space + car2);
			System.out.println(space + car3);
			System.out.println(space + car4);
			waitUp();
		}
		bspace = space;
		space = " ";
	}

	public void moveCarLeft() {
		for (int i = 0; i < 499; i+=3) {
			if (bspace.length() >= 2) {
				bspace = bspace.substring(1);
			}
			eraseScreen();
			System.out.println(bspace + bcar1);
			System.out.println(bspace + bcar2);
			System.out.println(bspace + bcar3);
			System.out.println(bspace + bcar4);
			waitUp();
		}
		bspace = space;
	}


}