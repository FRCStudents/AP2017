import felines.Lion;
import felines.Tiger;
import felines.Feline;

public class Animal {
  public static void main(String argv[]){
    Feline[] catz = new Feline[2];

    Lion ln = new Lion();
    System.out.println(ln.toString());

    System.out.println("Public variable: " + ln.voice);
    ln.voice = "Baaaahhhh";
    System.out.println("That public variable has just become: " + ln.voice);
    System.out.println("And also..." + ln.publicString);

    Tiger t = new Tiger();
    System.out.println(t.toString());

    System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    catz[0] = ln;
    catz[1] = t;
    for(int i=0; i<2; i++){
	System.out.println(catz[i]);
	}
  }
}
