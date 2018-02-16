public class RobotDriver {
	public static void main(String[] argv) {

		Robot r = new Robot();

		System.out.println("Hall: ");
		for (int i = 0; i < r.getHall().length; i++) {
			System.out.print("[" + r.getHall()[i] + "]");
		}
		System.out.println("");

		if (r.getPos() == 0) {
			System.out.print(" ");
		} else {
			for (int i = 0; i < (r.getPos() * 3) - 2; i++) {
				System.out.print(" ");
			}
		}
		if (r.getFacingRight()) {
			System.out.println(">");
		} else {
			System.out.println("<");
		}

		System.out.println("");

		System.out.println("Hall is clear: " + r.getHallIsClear());
		System.out.println("\n*Clearing Hall*");
		System.out.println("Moves: " + r.clearHall());

		System.out.println("");
		System.out.println("Hall: ");
		for (int i = 0; i < r.getHall().length; i++) {
			System.out.print("[" + r.getHall()[i] + "]");
		}
		System.out.println("");
		if (r.getPos() == 0) {
			System.out.print(" ");
		} else {
			for (int i = 0; i < (r.getPos() * 3) - 2; i++) {
				System.out.print(" ");
			}
		}
		if (r.getFacingRight()) {
			System.out.println(">");
		} else {
			System.out.println("<");
		}

		System.out.println("Hall is clear: " + r.getHallIsClear());

	}
}