class SundayDriver{

	// Attributes
	private String car1 = "  ______";
	private String car2 = "  |_||__|_";
	private String car3 = "	 |_______]";
	private String car4 = "	  @=@ @=@";
	private String space = " ";

	private String bcar1 = "      ______";
	private String bcar2 = " 	_|__||_|";
	private String bcar3 = "   [_______|";
	private String bcar4 = "	@=@	@=@";
	private String bspace = space;


	// Constructor
	SundayDriver() {
		String car1 = "  ______";
		String car2 = "  |_||__|_";
		String car3 = "	 |_______]";
		String car4 = "	  @=@ @=@";
		String space = " ";
		String bcar1 = "      ______";
		String bcar2 = " 	_|__||_|";
		String bcar3 = "   [_______|";
		String bcar4 = "	@=@	@=@";
		String bspace = space;
	}

	
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

	public void moveForward() {
		for (int i = 0; i < 99; i+=3) {
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

	public void moveBackward() {
		for (int i = 0; i < 99; i+=3) {
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