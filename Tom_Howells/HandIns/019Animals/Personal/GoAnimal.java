class GoAnimal {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];

        a[0] = new Toad();
        a[1] = new Dog();

        System.out.println("1: " + a[0]);
        System.out.println("2: " + a[1]);
    }
}