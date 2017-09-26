public class Calculator {
  public static void main(String[] args) {
    Mathematica x = new Mathematica();

    x.setA(5);
    x.setB(6);
    x.setC(12);
    System.out.print("\n Int A(x.a) is now set to " + x.a + ". \n Int B(x.b) is now set to " + x.b + ". \n Int C(x.c) is now set to " + x.c + ".\n");
    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

    System.out.println("x.add(x.a,x.b) returns " + x.add(x.a,x.b));
    System.out.println("x.subract(x.c,x.b) returns " + x.add(x.c,x.b));
    System.out.println("x.multiply(x.a,x.c) returns " + x.multiply(x.a,x.c));
    System.out.println("x.divide(x.a, x.b) returns " + x.divide(x.a,x.b));
    System.out.println("x.isDivisibleBy(x.C, x.b) returns " + x.isDivisibleBy(x.c,x.b));
    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


  }
}
