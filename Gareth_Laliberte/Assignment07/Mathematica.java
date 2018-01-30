public class Mathematica {

	private int num01;
	private int num02;
	private int num03;

	Mathematica(int ogNum01, int ogNum02, int ogNum03) {
		setNum01(ogNum01);
		setNum02(ogNum02);
		setNum03(ogNum03);
	}

	Mathematica() {
		setNum01(1);
		setNum02(2);
		setNum03(3);
	}

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

//The Math Part
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
		return (double)a / (double)b;
	}
	public boolean isDivisibleBy(int p, int q) {
		if ((p % q) == 0) {
			return true;
		} else {return false;
		}
	}

	public String toString() {
		return "Crazy maths, bro";
	}
}