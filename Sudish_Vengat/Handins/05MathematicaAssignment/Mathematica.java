public class Mathematica {
	int num01;
	int num02;
	int num03;

	int getNum01(){
		return num01;
	}
	void setNum01(int newNum01){
		num01 = newNum01;
	}
	int getNum02(){
		return num02;
	}
	void setNum02(int newNum02){
		num02 = newNum02;
	}
	int getNum03(){
		return num03;
	}
	void setNum03(int newNum03){
		num03 = newNum03;
	}

	int add(int a, int b){
		return a + b;
	}
	int subtract(int a, int b){
		return a - b;
	}
	int multiply(int a, int b){
		return a * b;
	}
	double divide(int a, int b){
		double c=a;
		double d=b;
		return c / d;
	}
	boolean isDivisibleBy(int p, int q){
		return p%q==0;
	}
}