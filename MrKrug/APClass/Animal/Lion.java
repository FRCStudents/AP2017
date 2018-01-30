public class Lion extends Animal {
    public Lion(){
      super(613, "Jungle", "Yellow", "Ar-Roar", 130);
      }

    @Override
    public void speak(){
	System.out.println("This lion says: " + super.getSpeech());
    }

    @Override
    public void speak(String s){
	System.out.println("This lion says: " + s);
    }

    public String toString(){
      return super.toString() + " is a " + super.getColor() + " Lion in the " + super.getHabitat();
      }
}
