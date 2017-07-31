package felines;

public class Feline {
  protected int weight;
  protected String habitat;
  protected String color;
  private int testInt;
  public String publicString;
  protected String protectedString;

  public Feline(){
    this(10,"Home", "Black");
  }

  public Feline(int w, String h, String c){
    setWeight(w);
    setHabitat(h);
    setColor(c);
    publicString = "This is declared as a public String";
    protectedString = "This is declared as a protected String";
  }

  public String toString(){
    return "This Feline is: ";
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

  protected void setWeight(int w){
    weight = w;
  }

  protected void setHabitat(String h){
    habitat = h;
  }

  protected void setColor(String c){
    color = c;
  }
}
