class Person implements IPerson {
    private String name;

    public Person(String n) {
        name = n;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println("My name is " + name + ".");
    }
}