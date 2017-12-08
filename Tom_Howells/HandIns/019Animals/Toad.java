class Toad extends Animal {
    public Toad() {
        super(4, 1, 2, "crrrrrroooooak", "ounce");
    }

    public String toString() {
        return "Toad - \"" + super.getSound() + "\"";
    }
}