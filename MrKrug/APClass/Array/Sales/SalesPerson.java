/**********************************************************
 * notice - you can not update in a foreach
 * loop... you can update the temporary variable...
 * but who cares?
 **********************************************************/
public class SalesPerson {
    String spName;
    int spSales;
    public SalesPerson(){
      this("Efraim", 0);
    }

    public SalesPerson(String name){
      this(name, 0);
    }

    public SalesPerson(String name, int sales){
      spName = name;
      spSales = sales;
    }

    public void setName(String name){
      spName = name;
    }

    public void setSales(int sales){
      spSales = sales;
    }

    public int getSales(){
      return spSales;
    }

    public String getName(){
      return spName;
    }

    public boolean higherThan(int sales){
      if(spSales > sales) return true;
      return false;
    }

    public boolean lowerThan(int sales){
      if(spSales < sales) return true;
      return false;
    }

}
