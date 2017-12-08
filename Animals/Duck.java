public class Duck{
  private int numberOfLegs;
  private int weight;
  private int speed;
  private String sound;
  private String units;
  private String name;

  public Duck(){
    this.numberOfLegs = 2;
    this.units = "g";
  }
  public Duck(int legs, int w, int s, String sound, String u, String n){
    this.numberOfLegs = legs;
    this.weight = w;
    this.speed = s;
    this.sound = sound;
    this.units = u;
    this.name = n;
  }

  public int getNumberOfLegs(){
    return this.numberOfLegs;
  }

  public void setNumberOfLegs(int n){
    this.numberOfLegs = n;
  }

  public int getWeight(){
    return this.weight;
  }

  public void setWeight(int w){
    this.weight = w;
  }

  public int getSpeed(){
    return this.speed;
  }

  public void setSpeed(int s){
    this.speed = s;
  }

  public String getSound(){
    return this.sound;
  }

  public void setSound(String s){
    this.sound = s;
  }

  public String getUnits(){
    return this.units;
  }

  public void setUnits(String u){
    this.units = u;
  }

  public String getName(){
    return this.name  ;
  }

  public void setName(String n){
    this.name =n;
  }

  public String toString(){
    return "This Ducks name is " + name;
  }
}
