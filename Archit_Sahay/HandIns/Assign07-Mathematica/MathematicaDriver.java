class MathematicaDriver {
	public static void main (String [] argv) {
	
		Mathematica c = new Mathematica();
		System.out.println("The numbers are 6 and 2");	
		System.out.println("Sum:" + c.add(6,2));
		System.out.println("Difference:"+ c.subtract(6,2));
		System.out.println("Product:" + c.multiply(6,2));
		System.out.println("Quotient"+ c.divide(6,2));
		System.out.println("Factor?:" + c.isDivisibleBy(6,2));
	}

}
