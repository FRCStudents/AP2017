public abstract class TaxableItem implements Item {
  protected double taxRate;
  
  public TaxableItem(){
    taxRate = 0.01;
  }
  public TaxableItem(double rate){
    taxRate = rate;
  }
  public TaxableItem(double d1, double d2, double d3){
    int x = 0;
  }

  public abstract double getListPrice();

  public double purchasePrice(){
    return (getListPrice() * taxRate) + getListPrice();
  }
}
