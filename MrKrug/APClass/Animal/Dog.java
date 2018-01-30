public class Dog extends Animal {
    public String voice;

    public Dog(){
      super(25, "Farm", "Brown", "Bark, Bark", 20);
      }

    public String toString(){
      return super.toString() + " is a " + super.getColor() + " Dog in the " + super.getHabitat();
      }
}
