public class Vehicle extends TaxableItem {
    private double dealer;
    private double markup;

    public Vehicle (double d, double m, double t){
      //super(t);
      dealer = d;
      markup = m;
      super.taxRate = t;
    }

    public double getListPrice(){
      return dealer + markup;
    }

    public void changeMarkup(double c){
      markup = c;
    }
}
