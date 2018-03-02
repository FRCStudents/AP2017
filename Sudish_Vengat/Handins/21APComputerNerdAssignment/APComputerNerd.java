class APComputerNerd implements Comparable{

    private int intelligence;
    private int speed;
    private int laptopPerformance;
    private String firstName;

    public APComputerNerd(int i, int s, int l, String f) {
        intelligence = i;
        speed = s;
        laptopPerformance = l;
        firstName = f;
    }

    public APComputerNerd() {
        this(7, 1, 5, "Ralph");
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
    public void setLaptopPerformance(int l) {
        laptopPerformance = l;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String f) {
        firstName = f;
    }


    public int compareTo(APComputerNerd nerd1, boolean choice) { 
        if (choice) {
            if (nerd1.getIntelligence() > intelligence) {
                return -1;
            } else if (nerd1.getIntelligence() < intelligence) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (nerd1.getFirstName().charAt(0) > firstName.charAt(0)) {
                return -1;
            } else if (nerd1.getFirstName().charAt(0) < firstName.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        return ("[" + firstName + "," + intelligence + "," + speed + "," + laptopPerformance + "]");
    }
}