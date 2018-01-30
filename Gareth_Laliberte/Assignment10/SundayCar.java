class SundayCar{

//I like this happy little guy better than the car.
	private String car = "ᕕ( ᐛ )ᕗ";
	private String space = " ";

	SundayCar() {
		String cara = "ᕕ( ᐛ )ᕗ";
	}

	public void eraseAll() {
		for(int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

	public void pause() {
		try {
			Thread.sleep(50);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void goRight() {
		for (int i = 0; i < 475; i+=3) {
			space = space + " ";
			eraseAll();
			System.out.println(space + car);
			pause();
		}
		spacea = space;
		space = " ";
	}

	public void goLeft() {
		for (int i = 0; i < 475; i+=3) {
			if (spacea.length() >= 2) {
				spacea = spacea.substring(1);
			}
			eraseAll();
			System.out.println(spacea + cara);
			pause();
		}
		spacea = space;
	}


}
