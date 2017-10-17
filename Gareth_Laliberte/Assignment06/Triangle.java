class Triangle {

	int side1 = 5;
	int side2 = 5;
	int side3 = 5;

	Triangle(int ogSide1, int ogSide2, int ogSide3) {
		setSide1(ogSide1);
		setSide2(ogSide2);
		setSide3(ogSide3);
	}
	Triangle() {
		setSide1(5);
		setSide2(5);
		setSide3(5);
	}


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

	public String toString() {
		return "That's a 3-sided boy right there.";
	}
}