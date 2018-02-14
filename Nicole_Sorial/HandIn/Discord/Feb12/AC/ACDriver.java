public class ACDriver {

	public static void main(String[] argv) {
		LittleAC l = new LittleAC();
		BigAC b = new BigAC();
		Chain c = new Chain();


		// Testing LittleAC
		System.out.println("LittleAC:");

		l.turnOnAC();
		System.out.println("AC is on (should be 1): " + l.getAC());

		l.turnOffAC();
		System.out.println("AC is off (should be 0): " + l.getAC());

		System.out.println("\n");
		l.putInBox();

		System.out.println("\n ======================== \n");

		// Testing BigAC
		System.out.println("BigAC:");

		b.turnOnAC();
		System.out.println("AC is on (should be 10): " + b.getAC());

		b.turnOffAC();
		System.out.println("AC is off (should be -10): " + b.getAC());

		System.out.println("\n");
		b.putInBox();

		System.out.println("\n ======================== \n");

		// Testing Chain
		System.out.println("Chain:");

		for (int i = 0; i < c.getA().length; i++) {
			System.out.print("[" + c.getA()[i].getAC() + "]");
		}

		System.out.print("\n");
		c.setChain();

		for (int i = 0; i < c.getA().length; i++) {
			System.out.print("[" + c.getA()[i].getAC() + "]");
		}

		System.out.print("\n");

	}
}