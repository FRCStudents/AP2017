package felines;

public class Tiger extends Feline {
    public String voice;
    private boolean mane;

    public Tiger(){
      super(613, "Jungle", "Yellow/Orange");
      voice = "ROAR";
      mane = false;
      }

    public String toString(){
      return super.toString() + " is a " + super.getColor() + " Tiger in the " + super.getHabitat() +
          "\nProtected: " + this.protectedString;
      }
}
