import felines.Lion;

public class Animal {
  public static void main(String argv[]){
    Lion ln = new Lion();
    System.out.println(ln.toString());
    System.out.println("Public variable: " + ln.voice);
    System.out.println("And also..." + ln.publicString);
  }
}
