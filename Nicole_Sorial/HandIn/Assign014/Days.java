// an object that sets up the days of the week and prints them first in order
// and then in reverse order

class Days {

	// Attributes
	String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	Days() {
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	}

	// Methods
	public void printInOrder() {
		System.out.println("Days of the week in order:");
		for (int i = 0; i < 7; i++) {
			System.out.print(days[i] + " ");
		}
		System.out.println("");
	}

	public void printInReverse() {
		System.out.println("Days of the week in reverse order:");
		for (int i = 6; i >= 0; i --) {
			System.out.print(days[i] + " ");
		}
		System.out.println("");
	}


}