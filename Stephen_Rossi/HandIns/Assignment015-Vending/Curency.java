public class Curency {
  private double value;
  private String name;
  private double size;
  private int ammount;

  public Curency(String name, double value, int ammount, double size){
    this.name = name;
    this.value = value;
    this.ammount = ammount;
    this.size = size;
  }

  public double getValue() {
    return this.value;
  }
  public void setValue(double x){
    this.value = x;
  }

  public String getName(){
    return this.name;
  }
  public void setName(String x){
    this.name = x;
  }

  public double getSize(){
    return this.size;
  }
  public void setSize(double x){
    this.size = x;
  }

  public int getAmount(){
    return this.ammount;
  }
  public void setAmmount(int x){
    this.ammount = x;
  }
}
