class PersonTest {
    public static Person[] people = new Person[3];

    public static void main(String[] args) {
        people[0] = new Person("Tom");
        people[1] = new Person("Steve");
        people[2] = new Person("Nicole");

        for (int i = 0; i < people.length; i++) {
            people[i].speak();
        }
    }
}