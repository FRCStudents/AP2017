public class Mathematica {

	// ATTRIBUTES
	private int num01;
	private int num02;
	private int num03;

	// METHODS
	// Constructors
	Mathematica(int starting_num01, int starting_num02, int starting_num03) {
		setNum01(starting_num01);
		setNum02(starting_num02);
		setNum03(starting_num03);
	}

	Mathematica() {
		setNum01(1);
		setNum02(2);
		setNum03(3);
	}

	// Getters and Setters
	public int getNum01() {
		return num01;
	}
	public void setNum01(int new_num01) {
		num01 = new_num01;
	}
	public int getNum02() {
		return num02;
	}
	public void setNum02(int new_num02) {
		num02 = new_num02;
	}
	public int getNum03() {
		return num03;
	}
	public void setNum03(int new_num03) {
		num03 = new_num03;
	}

	// Other Functions
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public double divide(int a, int b) {
		return (double)a / (double)b; // An int divided by an int results in an int. Need to convert to double to produce a double
	}
	public boolean isDivisibleBy(int p, int q) {
		if ((p % q) == 0) {
			return true;
		} else {return false;
		}
	}

	// toString
	public String toString() {
		return "calculator woot woot!!";
	}
}