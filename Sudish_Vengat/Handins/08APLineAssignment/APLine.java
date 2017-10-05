public class APLine {
	int num01;
	int num02;
	int num03;

	int getNum01() {
		return num01;
	}
	void setNum01(int newNum01) {
		num01 = newNum01;
	}
	int getNum02() {
		return num02;
	}
	void setNum02(int newNum02) {
		num02 = newNum02;
	}
	int getNum03() {
		return num03;
	}
	void setNum03(int newNum03) {
		num03 = newNum03;
	}

	double line1(int a, int b) {
		double c = a;
		double d = b;
		return c / d;
	}
	boolean line2(int x, int a) {
		int c = x;
		int b = a;
		if(c * b != 0) {
			return true;
		}else{
			return false;
		}
	}
	boolean line3(int y, int b) {
		int c = y;
		int d = b;
		if(c * d != 0) {
			return true;
		}else{
			return false;
		}
	}
 }