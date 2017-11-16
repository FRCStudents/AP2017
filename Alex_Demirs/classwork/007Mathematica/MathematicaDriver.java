class MathematicaDriver {
	public static void main (String [] argv) {
	
		Mathematica c = new Mathematica();
		
		System.out.println(c.add(2,5));

		
		System.out.println(c.subtract(2,5));

		
		System.out.println(c.multiply(2,5));

		
		System.out.println(c.divide(5,2));
		

		System.out.println(c.isDivisibleBy(5,2));
	}
}
