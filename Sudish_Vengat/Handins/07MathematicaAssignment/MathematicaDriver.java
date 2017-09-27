public class MathematicaDriver {
	
	public static void main (String [] argv) {
	
		Mathematica c = new Mathematica();

		System.out.println(c.add(3,4));
		System.out.println(c.subtract(3,4));
		System.out.println(c.multiply(3,4));
		System.out.println(c.divide(3,4));
		System.out.println(c.isDivisibleBy(3,4));
	}
}