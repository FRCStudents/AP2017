public class APNerdDriver {
	public static void main(String[] argv) {

		APComputerNERDC a = new APComputerNERDC(1, 2, 7, "Jim");
		APComputerNERDC b = new APComputerNERDC(2, 2, 2, "Michael");
		APComputerNERDC c = new APComputerNERDC(3, 4, 1, "Michaela");
		APComputerNERDC d = new APComputerNERDC(4, 2, 4, "Pam");
		APComputerNERDC e = new APComputerNERDC(3, 3, 3, "Dwight");

		APComputerNERDC[] arrayOfNerds = {a, d, b, e, c, b, b, a, e};

		// necessary in order to not change the original arrayOfNerds
		APComputerNERDC[] intelligentNerds = new APComputerNERDC[arrayOfNerds.length];
		APComputerNERDC[] speedyNerds = new APComputerNERDC[arrayOfNerds.length];
		APComputerNERDC[] performingNerds = new APComputerNERDC[arrayOfNerds.length];
		APComputerNERDC[] namedNerds = new APComputerNERDC[arrayOfNerds.length];

		for (int i = 0; i < arrayOfNerds.length; i++) {
			intelligentNerds[i] = arrayOfNerds[i];
			speedyNerds[i] = arrayOfNerds[i];
			performingNerds[i] = arrayOfNerds[i];
			namedNerds[i] = arrayOfNerds[i];
		}

		// ==============================================================================

		System.out.println("Before Sort:");
		System.out.print("Intelligence: ");
		for (int i = 0; i < intelligentNerds.length; i++) {
			System.out.print("[" + intelligentNerds[i].getIntelligence() + "]");
		}
		System.out.print("\nSpeed: ");
		for (int i = 0; i < speedyNerds.length; i++){
			System.out.print("[" + speedyNerds[i].getSpeed() + "]");
		}
		System.out.print("\nLaptop Performance: ");
		for (int i = 0; i < performingNerds.length; i++) {
			System.out.print("[" + performingNerds[i].getPerformance() + "]");
		}
		System.out.print("\nName: ");
		for (int i = 0; i < namedNerds.length; i++) {
			System.out.print("[" + namedNerds[i].getFName() + "]");
		}

		System.out.println("");
		System.out.println("");

		System.out.println("After Sort:");
		a.sortByIntelligence(intelligentNerds);
		System.out.print("Intelligence: ");
		for (int i = 0; i < intelligentNerds.length; i++) {
			System.out.print("[" + intelligentNerds[i].getIntelligence() + "]");
		}
		a.sortBySpeed(speedyNerds);
		System.out.print("\nSpeed: ");
		for (int i = 0; i < speedyNerds.length; i++) {
			System.out.print("[" + speedyNerds[i].getSpeed() + "]");
		}
		a.sortByPerformance(performingNerds);
		System.out.print("\nLaptop Performance: ");
		for (int i = 0; i < performingNerds.length; i++) {
			System.out.print("[" + performingNerds[i].getPerformance() + "]");
		}
		a.sortByFName(namedNerds);
		System.out.print("\nName: ");
		for (int i = 0; i < namedNerds.length; i++) {
			System.out.print("[" + namedNerds[i].getFName() + "]");
		}

		System.out.println("");

	}
}