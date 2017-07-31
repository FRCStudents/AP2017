/**********************************************************
 * notice - you can not update in a foreach
 * loop... you can update the temporary variable...
 * but who cares?
 **********************************************************/
import java.util.*;

public class SalesPersonArray {
  private SalesPerson[] sArray;

  public SalesPersonArray(){
      Scanner getStuff = new Scanner(System.in);
      System.out.println("How many sales people do you have? ");
      int numPeeps = getStuff.nextInt();
      sArray = new SalesPerson [numPeeps];

      String name;

      for (int i=0; i < numPeeps; i++){
          System.out.println("Please enter the name for sales person #" + (i+1) + ": ");
          name = getStuff.next();

          SalesPerson sp = new SalesPerson(name);
          sArray[i] = sp;

          System.out.println("Please enter the total sales: ");
          sp.setSales(getStuff.nextInt());
        }
  }

  public SalesPerson getBiggest(){
    SalesPerson max = new SalesPerson("",0);

    for (SalesPerson sp: sArray){
      if(sp.higherThan(max.getSales())){
          max = sp;
      }
    }
    return max;
  }

  public SalesPerson getLittlest(){
    SalesPerson min = new SalesPerson("", 999999999);

    for (SalesPerson sp: sArray){
      if(sp.lowerThan(min.getSales())){
          min = sp;
      }
    }
    return min;
  }

  public int getTotal(){
    int total = 0;
    for (SalesPerson sp: sArray){
      total += sp.getSales();
    }
    return total;
  }

  public int getAverage(){
    int total = getTotal();
    return total / sArray.length;
  }
}
