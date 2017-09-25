class Triangle {

	// ATTRIBUTES
	int side1 = 5;
	int side2 = 5;
	int side3 = 5;

	// METHODS

	// Constructors
	Triangle(int startingSide1, int startingSide2, int startingSide3) {
		setSide1(startingSide1);
		setSide2(startingSide2);
		setSide3(startingSide3);
	}
	Triangle() {
		setSide1(5);
		setSide2(5);
		setSide3(5);
	}


	// Getters and Setters
	public int getSide1() {
		return side1;
	}
	public void setSide1(int new_side1) {
		side1 = new_side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int new_side2) {
		side2 = new_side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int new_side3) {
		side3 = new_side3;
	}

	// toString
	public String toString() {
		return "tRIANGLEZ";
	}
}