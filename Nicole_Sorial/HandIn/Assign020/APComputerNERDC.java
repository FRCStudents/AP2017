public class APComputerNERDC implements Comparable {

	// ATTRIBUTES
	// I really don't feel like putting restrictions on what the values can be (like between 9 and 10, etc)
	private int intelligence; // 9 - 10
	private int speed; // 4 - 18
	private int laptopPerformance; // 0 - 10
	private String firstName; 

	APComputerNERDC(int i, int s, int l, String f) {
		intelligence = i;
		speed = s;
		laptopPerformance = l;
		firstName = f;
	}

	APComputerNERDC() {
		this(9, 4, 0, "Nicole");
	}

	// INTERFACE METHODS
	@Override
	public void swapObject(int i, int j, Object[] objArray) {
		Object hold = objArray[i];
		objArray[i] = objArray[j];
		objArray[j] = hold;
	}

	@Override
	public int[] compareTo(Object o, Object p){
		APComputerNERDC Nerd1 = (APComputerNERDC)o;
		APComputerNERDC Nerd2 = (APComputerNERDC)p;

		// array of -1, 1, or 0 for sorting
		// [intelligence, speed, laptopPerformance, firstName]
		int[] comparisonArray = {compareIntelligence(Nerd1, Nerd2), compareSpeed(Nerd1, Nerd2),
			 comparePerformance(Nerd1, Nerd2), compareFName(Nerd1, Nerd2)};

		return comparisonArray;
		/* This was used when compareTo() was only comparing one attribute

		int i1 = Nerd1.getIntelligence();
		int i2 = Nerd2.getIntelligence();

		if (i1 == i2) {
			return 0;
		} else if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return -2;
		} */
	}

	// OTHER METHODS -- helpers for interface methods
	public int getIntelligence() {
		return intelligence;
	}

	public int getSpeed() {
		return speed;
	}

	public int getPerformance() {
		return laptopPerformance;
	}

	public String getFName() {
		return firstName;
	}

	// All compare functions will return:
	//		-1 if the first is greater than the second (aka -1 = not sorted)
	// 		1 if the first is less than the second (aka 1 = sorted)
	//		0 if they are equal

	public int compareIntelligence(APComputerNERDC a, APComputerNERDC b) {
		int i1 = a.getIntelligence();
		int i2 = b.getIntelligence();

		if (i1 == i2) {
			return 0;
		} else if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return -2;
		}
	}

	public int compareSpeed(APComputerNERDC a, APComputerNERDC b) {
		int i1 = a.getSpeed();
		int i2 = b.getSpeed();

		if (i1 == i2) {
			return 0;
		} else if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return -2;
		}
	}

	public int comparePerformance(APComputerNERDC a, APComputerNERDC b) {
		int i1 = a.getPerformance();
		int i2 = b.getPerformance();

		if (i1 == i2) {
			return 0;
		} else if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return -2;
		}
	}

	public int compareFName(APComputerNERDC a, APComputerNERDC b) {
		char i1 = a.getFName().charAt(0);
		char i2 = b.getFName().charAt(0);

		if (i1 == i2) {

			// checks to see if the rest of the name is the same
			for (int i = 1; i < a.getFName().length() && i < b.getFName().length(); i++) {
				if (a.getFName().charAt(i) > b.getFName().charAt(i)) {
					return -1;
				} else if (a.getFName().charAt(i) < b.getFName().charAt(i)) {
					return 1;
				}
			}

			// if rest of the name is the same but one is longer (ie. Alex and Alexandria)
			if (a.getFName().length() > b.getFName().length()) {
				return -1;
			} else if (a.getFName().length() < b.getFName().length()) {
				return 1;
			} else if (a.getFName().length() == b.getFName().length()) {
				return 0;
			}

		} else if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		}

		// shouldn't reach here but
		return -2;
	}

	public void sortByIntelligence(APComputerNERDC[] nerdArray) {
		for (int i = 0; i < nerdArray.length; i++) {
			for (int j = i + 1; j < nerdArray.length; j++) {
				if (compareTo(nerdArray[i], nerdArray[j])[0] == 1) {
					// do nothing
				} else if (compareTo(nerdArray[i], nerdArray[j])[0] == 0) {
					swapObject(j, i + 1, nerdArray);
				} else if (compareTo(nerdArray[i], nerdArray[j])[0] == -1) {
					System.out.println(compareTo(nerdArray[i], nerdArray[j]));
					swapObject(i, j, nerdArray);
				}
			}
		}
		if (compareTo(nerdArray[nerdArray.length - 2], nerdArray[nerdArray.length - 1])[0] == -1) {
			swapObject(nerdArray.length - 2, nerdArray.length - 1, nerdArray);
		}
	}

	public void sortBySpeed(APComputerNERDC[] nerdArray) {
		for (int i = 0; i < nerdArray.length; i++) {
			for (int j = i + 1; j < nerdArray.length; j++) {
				if (compareTo(nerdArray[i], nerdArray[j])[1] == 1) {
					// do nothing
				} else if (compareTo(nerdArray[i], nerdArray[j])[1] == 0) {
					swapObject(j, i + 1, nerdArray);
				} else if (compareTo(nerdArray[i], nerdArray[j])[1] == -1) {
					swapObject(i, j, nerdArray);
				}
			}
		}
		if (compareTo(nerdArray[nerdArray.length - 2], nerdArray[nerdArray.length - 1])[1] == -1) {
			swapObject(nerdArray.length - 2, nerdArray.length - 1, nerdArray);
		}
	}

	public void sortByPerformance(APComputerNERDC[] nerdArray) {
		for (int i = 0; i < nerdArray.length; i++) {
			for (int j = i + 1; j < nerdArray.length; j++) {
				if (compareTo(nerdArray[i], nerdArray[j])[2] == 1) {
					// do nothing
				} else if (compareTo(nerdArray[i], nerdArray[j])[2] == 0) {
					swapObject(j, i + 1, nerdArray);
				} else if (compareTo(nerdArray[i], nerdArray[j])[2] == -1) {
					swapObject(i, j, nerdArray);
				}
			}
		}
	
		if (compareTo(nerdArray[nerdArray.length - 2], nerdArray[nerdArray.length - 1])[2] == -1) {
			swapObject(nerdArray.length - 2, nerdArray.length - 1, nerdArray);
		}
	}

	public void sortByFName(APComputerNERDC[] nerdArray) {
		for (int i = 0; i < nerdArray.length; i++) {
			for (int j = i + 1; j < nerdArray.length; j++) {
				if (compareTo(nerdArray[i], nerdArray[j])[3] == 1) {
					// do nothing
				} else if (compareTo(nerdArray[i], nerdArray[j])[3] == 0) {
					swapObject(j, i + 1, nerdArray);
				} else if (compareTo(nerdArray[i], nerdArray[j])[3] == -1) {
					swapObject(i, j, nerdArray);
				}
			}
		}
		if (compareTo(nerdArray[nerdArray.length - 2], nerdArray[nerdArray.length - 1])[3] == -1) {
			swapObject(nerdArray.length - 2, nerdArray.length - 1, nerdArray);
		}
	}

	public String toString() {
		return getFName();
	}





}