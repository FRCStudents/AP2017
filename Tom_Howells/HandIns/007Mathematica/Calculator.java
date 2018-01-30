class Calculator{
    public static void main(String[] args) {
        Mathematica math = new Mathematica();

        math.setNum01(3);
        math.setNum02(7);
        math.setNum03(10);

        System.out.println(math.getNum01());
        System.out.println(math.getNum02());
        System.out.println(math.getNum03());
        System.out.println("---");
        System.out.println(math.add(math.getNum01(), math.getNum03()));
        System.out.println(math.subtract(math.getNum01(), math.getNum03()));
        System.out.println("---");
        System.out.println(math.multiply(math.getNum02(), math.getNum01()));
        System.out.println("---");
        System.out.println(math.divide(math.getNum02(), math.getNum01()));
        System.out.println(math.isDivisibleBy(math.getNum02(), math.getNum01()));
    }
}
