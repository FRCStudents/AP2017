class Dog extends Animal {
    public Dog() {
        super(4, 75, 15, "ruff ruff", "pounds");
    }

    public String toString() {
        return "Dog - \"" + super.getSound() + "\"";
    }
}