class Car {

	// Attributes
	int wheels = 4;
	String drive = "2";
	int current_speed = 30;
	// current_direction should be "n", "s", "e", or "w"
	String current_direction = "n";

	// Methods
	public int getCurrentSpeed() {
		return current_speed;
	}

	public void setCurrentSpeed(int new_speed) {
		current_speed = new_speed;
	}

	public String getCurrentDirection() {
		return current_direction;
	}

	public void setCurrentDirection(String new_direction) {
		current_direction = new_direction;
	}

	public String toString() {
		return "Yo Baby";
	}
}