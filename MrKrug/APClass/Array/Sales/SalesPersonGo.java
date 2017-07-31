/******************************************************************************
 * SalesPersonGo:
 * Creates an object - SalesPersonArray - which is an array of SalesPerson
 * This array object has all the array type methods
 ******************************************************************************/
import java.text.*;

public class SalesPersonGo {
  public static void SOP(String s){
    System.out.println(s);
  }

  public static void main(String [] argv){
    SalesPersonArray spA = new SalesPersonArray();
    DecimalFormat myFormatter = new DecimalFormat("###,###,###.##");

    String totalPrice = myFormatter.format(spA.getTotal());
    SOP("Total Sales: $" + totalPrice);

    String averagePrice = myFormatter.format(spA.getAverage());
    SOP("Average Sales: $" + averagePrice);

    String biggestSales = myFormatter.format(spA.getBiggest().getSales());
    SOP("Biggest Guy: " + spA.getBiggest().getName() + ": $" + biggestSales);

    String littlestSales = myFormatter.format(spA.getLittlest().getSales());
    SOP("Littlest Guy: " + spA.getLittlest().getName() + ": $" + littlestSales);
  }
}
