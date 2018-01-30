class Animal {
    protected int numberOfLegs;
    protected int weight;
    protected int speed; // automatically meters per second
    protected String sound;
    protected String unit; // for weight

    public Animal(int l, int w, int sp, String so, String u) {
        numberOfLegs = l;
        weight = w;
        speed = sp;
        sound = so;
        unit = u;
    }

    protected void setNumberOfLegs(int l) {
        numberOfLegs = l;
    }
    protected int getNumberOfLegs() {
        return numberOfLegs;
    }
    protected void setWeight(int w) {
        weight = w;
    }
    protected int getWieght() {
        return weight;
    }
    protected void setSpeed(int s) {
        speed = s;
    }
    protected int getSpeed() {
        return speed;
    }
    protected void setSound(String s) {
        sound = s;
    }
    protected String getSound() {
        return sound;
    }
    protected void setUnit(String u) {
        unit = u;
    }
    protected String getUnit() {
        return unit;
    }
}