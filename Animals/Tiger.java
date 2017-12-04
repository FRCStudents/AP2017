public class Tiger extends Animal {
    public String voice;

    public Tiger(){
      super(613, "Jungle", "Yellow/Orange", "Roar", 120);
      }

    public String toString(){
      return super.toString() + " is a " + super.getColor() + " Tiger in the " + super.getHabitat();
      }
}
