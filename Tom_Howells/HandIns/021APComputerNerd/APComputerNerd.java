class APComputerNerd implements Comparable{
    private int intelligence;
    private int speed;
    private int laptopPerformance;
    private String firstName;

    public APComputerNerd(int i, int s, int lp, String fn) {
        intelligence = i;
        speed = s;
        laptopPerformance = lp;
        firstName = fn;
    }

    public APComputerNerd() {
        this(9, 10, 8, "Dilbert");
    }

    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int i) {
        intelligence = i;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int s) {
        speed = s;
    }

    public int getLaptopPerformance() {
        return laptopPerformance;
    }
    public void setLaptopPerformance(int lp) {
        laptopPerformance = lp;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fn) {
        firstName = fn;
    }

    // return -1 if other is greater, 0 if equal, and 1 if this object is greater
	// Something you could do:
	// 	Create a new attribute called "sortByType", then default it
	//	to 0, and write a method called "setSortByType(int i)" and 
	//	allow the client to set it to a non-zero value (or binary).

	// 	In your compareto function, you can check that sortByType
	//	and determine if you will sort by name or intelligence...
	//	
	//	If you did that, in your driver you would:
	//		1) create the array
	//		2) sort in the defaulted way
	//		3) walk the array and set the sortByType variables
	//		4) and sort the array (by the other attribute)
	//		
	//		What do you think?
	//

    public int compareTo(APComputerNerd nerd, boolean choice) { // choice = 0 for intelligence, choice = 1 for firstName
        if (choice) {
            if (nerd.getIntelligence() > intelligence) {
                return -1;
            } else if (nerd.getIntelligence() < intelligence) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (nerd.getFirstName().charAt(0) > firstName.charAt(0)) {
                return -1;
            } else if (nerd.getFirstName().charAt(0) < firstName.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        return (firstName + "(" + intelligence + "," + speed + "," + laptopPerformance + ")");
    }
}
