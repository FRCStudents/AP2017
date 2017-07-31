
/***************************
 * the story
 ***************************/

public class Story{

  private static void send(String s){
    System.out.println(s);
  }

  private static String alive(boolean b){
    if(b){
      return "Alive";
    }
    return "Quite Dead";
  }

  public static void main(String args[]){
      Villain v = new Villain();
      Superhero s = new Superhero();

      send("There was a guy called, " + v.getName());
      send("and " + v.getName() + " was not nice. \nHe hated " + s.getName());
      send("\tNow everyone knows that " + s.getName() + " was a Super Dude with ");
      send("the super power of " + s.getSuperpower() + " and a very good heath. He was healthy.");
      send("Actually, " + s.getName() + " was " + alive(s.living()) + " and " + v.getName() + " was " + alive(v.living()));
      while(s.living() && v.living()){
        send(s.getName() + " wacked " + v.getName() + " but " + v.getName() + " was " + alive(v.living()));
        v.reduceHealth(2);
        send("But " + v.getName() + " wacked him back... and he was " + alive(s.living()));
        s.reduceHealth(1);
      }
        send("Now, " + s.getName() + " is " + alive(s.living()) + " " + v.getName() + " is " + alive(v.living()) );
  }
}
