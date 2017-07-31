package felines;

public class Lion extends Feline {
    public String voice;
    private boolean mane;

    public Lion(){
      super(598, "Jungle", "Gold");
      voice = "ROAR";
      mane = true;
      }

    public String toString(){
      return super.toString() + super.getColor() + ": LION in the " + super.getHabitat() +
          "\nProtected: " + this.protectedString;
      }
}
