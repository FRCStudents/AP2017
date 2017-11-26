public class Lion extends Animal {
    public Lion(){
      super(613, "Jungle", "Yellow", "Ar-Roar", 130);
      }

    public String toString(){
      return super.toString() + " is a " + super.getColor() + " Lion in the " + super.getHabitat();
      }
}
