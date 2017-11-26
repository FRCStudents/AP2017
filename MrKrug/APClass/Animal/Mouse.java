public class Mouse extends Animal {
    public String voice;

    public Mouse(){
      super(2, "Farm", "Grey", "Squeek, Squeek", 2);
      super.setUnits("Grams");
      }

    public String toString(){
      return super.toString() + " is a " + super.getColor() + " Mouse in the " + super.getHabitat();
      }
}
