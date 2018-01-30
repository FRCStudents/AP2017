import felines.Lion;
import felines.Tiger;
import felines.Feline;
import felines.Bobcat;

public class Animal {
  public static Lion createLion(){
	Lion ln = new Lion();
	System.out.println(ln.toString());
	System.out.println("==== demonstration of public variables... a problem! ===");
	System.out.println("==== Voice: " + ln.voice + " ===");
	ln.voice = "Baaaahhhh";
	System.out.println("==== Voice (now - after changing the public variable: " + ln.voice + " ===");
	System.out.println("==== and there is also this public string: " + ln.publicString);
   	return ln;
  }

  public static Tiger createTiger(){
	Tiger t = new Tiger();
	System.out.println(t.toString());
	return t;
  }

  public static Bobcat createBobcat(){
	Bobcat b = new Bobcat();
	System.out.println(b.toString());
	return b;
  }

  public static void main(String argv[]){
    // Notice: this is an array of Feline, and
    // we are populatiing it with a number of 
    // classes - all of which have been derived 
    // from 'Feline'
    //
    Feline[] catz = new Feline[3];

    catz[0] = createLion();
    catz[1] = createTiger();
    catz[2] = createBobcat();

    for(int i=0; i<3; i++){
	System.out.println(catz[i]);
	}
  }
}
