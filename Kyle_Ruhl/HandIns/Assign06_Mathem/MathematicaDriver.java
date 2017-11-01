//driver for Mathematica.java
public class MathematicaDriver {

	public static void main(String[] argv) {
		Mathematica m = new Mathematica();
		//C.add(2,5);
 		//"Result from add";
		System.out.println(m .add (2,5));
		System.out.println(m .subtract (67,34));
		System.out.println(m .multiply (90,6));
		System.out.println(m .divide (5,5));
		System.out.println(m .isDivisibleBy (500,86));
	}
}
