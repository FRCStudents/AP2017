class Egg {

	// Attributes
	boolean fertilized = true;
	String color = "white";

	// Methods
	public boolean getFertilized() {
		return fertilized;
	}

	public void setFertilized(boolean new_fertilized) {
		fertilized = new_fertilized;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String new_color) {
		color = new_color;
	}

	public String toString() {
		return "smol egg";
	}
}