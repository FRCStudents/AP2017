public class Animal {
  protected int weight;
  protected String habitat;
  protected String color;
  protected String speech;
  protected int speed;
  protected String units;

  public Animal(){
    this(10,"Home", "Black", "Bow Wow", 30);
  }

  public Animal(int w, String h, String c, String s, int sp){
    units = "Pounds";
    setWeight(w);
    setHabitat(h);
    setColor(c);
    setSpeech(s);
    setSpeed(sp);
  }

  public void setUnits(String s){
    units = s;
  }

  public String getUnits(){
    return units;
  }

  public String toString(){
    return "Animal: lives in [" + getHabitat() + "] - and weighs: [" + getWeight() +" " + getUnits() + "]";
  }

  protected int getWeight(){
    return weight;
  }

  protected String getHabitat(){
    return habitat;
  }

  protected String getColor(){
    return color;
  }

  protected String getSpeech(){
    return speech;
  }

  protected int getSpeed(){
    return speed;
  }

  protected void setWeight(int w){
    weight = w;
  }

  protected void setHabitat(String h){
    habitat = h;
  }

  protected void setColor(String c){
    color = c;
  }

  protected void setSpeech(String s){
    speech = s;
  }

  protected void setSpeed(int s){
    speed = s;
  }   

  public void speak(){
	System.out.println("This animal says... " + getSpeech());
  } 

  public void speak(String s){
	System.out.println("This animal says... " + s);
  }
}
