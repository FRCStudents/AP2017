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
        this(-1, -1, -1, "");
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