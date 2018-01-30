public class mathematicaDriver {

	public static void main(String[] argv) {
		Mathematica m = new Mathematica();
		System.out.println("result from add 2 and 5 is " + m.add(2, 5));
		System.out.println("result from add 2 and -5 is " + m.add(2, -5));
		System.out.println("result from subtract 2 and 5 is " + m.subtract(2, 5));
		System.out.println("result from subtract 5 and 2 is " + m.subtract(5, 2));
		System.out.println("result from multiply 2 and 5 is " + m.multiply(2, 5));
		System.out.println("result from add 2 and 5 is " + m.add(2, 5));
		System.out.println("result from divide 2 and 5 is " + m.divide(2, 5));
		System.out.println("result from divide 5 and 2 is " + m.divide(5, 2));
		System.out.println("result from is divisible by 2 and 5 is " + m.isDivisibleBy(2, 5));
		System.out.println("result from is divisible by 4 and 2 is " + m.isDivisibleBy(4, 2));
	}
}