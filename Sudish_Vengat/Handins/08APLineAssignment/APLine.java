public class APLine {

private	int a;
private	int b;
private	int c;

	public void APline(int newerA, int newerB, int newerC){
		a = newerA;
		b = newerB;
		c = newerC;
	}

	int getA() {
		return a;
	}
	void setA(int newA) {
		a = newA;
	}
	int getB() {
		return b;
	}
	void setB(int newB) {
		b = newB;
	}
	int getC() {
		return c;
	}
	void setC(int newC) {
		c = newC;
	}

	public double getSlope() {
		return -1 * (double)-a/(double)b;
	}

	boolean isOnLine(int x, int y) {
		if((a * x) + (b * y) + c == 0){
			return true;
		} else {
			return false;
		}
	}
}