class Toad {
    // attributes
    private int numberOfLegs;
    private int weight;
    private int speed; // automatically meters per second
    private String sound;
    private String unit; // for weight

    // constructors
    public Toad(int l, int w, int sp, String so, String u) {
        numberOfLegs = l;
        weight = w;
        speed = sp;
        sound = so;
        unit = u;
    }
    public Toad() {
        this(4, 1, 2, "crrrrrroooooak", "ounce");
    }

    // getters / setters
    public void setNumberOfLegs(int l) {
        numberOfLegs = l;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void setWeight(int w) {
        weight = w;
    }
    public int getWieght() {
        return weight;
    }
    public void setSpeed(int s) {
        speed = s;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSound(String s) {
        sound = s;
    }
    public String getSound() {
        return sound;
    }
    public void setUnit(String u) {
        unit = u;
    }
    public String getUnit() {
        return unit;
    }

    // toString
    public String toString() {
        return "Toad\n" + sound;
    }
}