public class Mathematica {
    int a;
    int b;
    int c;
    public int getA(){
      return a;
    }
    public void setA(int valueA) {
      a = valueA;
    }
    public int getB(){
      return b;
    }
    public void setB(int valueB) {
      b = valueB;
    }
    public int getC(){
      return c;
    }
    public void setC(int valueC) {
      c = valueC;
    }
    public int add(int a, int b) {
      return a+b;
    }
    public int subract(int a, int b) {
      return a-b;
    }
    public int multiply(int a, int b) {
      return a*b;
    }
    public double divide(int a, int b) {
      return (double)a/b;
    }
    public boolean isDivisibleBy(int a, int b) {
      return a % b == 0;
    }
}
