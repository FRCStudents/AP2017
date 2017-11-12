package felines;

public class Bobcat extends Feline {
    public String voice;
    private boolean mane;

    public Bobcat(){
      super(598, "Jungle", "Striped");
      voice = "Bobby ROAR";
      mane = true;
      }

    public String toString(){
      return super.toString() + "is a " + super.getColor() + " Bobcat in the " + super.getHabitat() +
          "\nProtected: " + this.protectedString;
      }
}
