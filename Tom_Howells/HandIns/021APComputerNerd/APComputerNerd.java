abstract class APComputerNerd implements Comparable{
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

    public int compareTo(Object o, int choice) { // choice = 0 for intelligence, choice = 1 for firstName
        if (choice == 0) {
            return 0;
        } else if (choice == 1) {
            return 1;
        }
    }
}