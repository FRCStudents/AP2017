public class Mathematica{ 

	int num01=1;
	int num02=3;
	int num03=4;

	public Mathematica(int n1, int  n2, int n3) {
		num01 = n1;
		num02 = n2;
		num03 = n3;
	}

	public int getNum01() {
	  return this.num01;
	}
	public void setNum01(int n) {
		num01 = n;
	}

	public int getNum02() {
	  return this.num02;
	}
	public void setNum02(int n) {
		num02 = n;
	}

	public int getNum03() {
	  return this.num03;
	}
	public void setNum03(int n) {
		num03 = n;
	}

	public String toString() {
		return String.format("%d,%d,%d", num01, num02, num03);
	}

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
		return (double)a / b;
		// alternativly we can do:
		// double c=a;
		// double d=b;
		// return c/d;
	}
	public boolean isDivisibleBy(int p, int q) {
		 int r = p % q;
		 return r == 0;
	}

	
	public static void main(String [] args) {
	  Mathematica m = new  Mathematica(1,3,4);
	  System.out.println(m);	

	  int a = 4;
	  int b = 4;
	  System.out.println("a=" + a + " b=" + b);
	  System.out.println("add=" + m.add(a,b));
	  System.out.println("subtract=" + m.subtract(a,b));
	  System.out.println("multiply=" + m.multiply(a,b));
	  System.out.println("divide=" + m.divide(a,b));
	  System.out.println("isDivisibleBy=" + m.isDivisibleBy(a,b));

	  
	}

}