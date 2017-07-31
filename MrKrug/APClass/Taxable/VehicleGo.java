
/*
 * VehicleGo...
 */
import java.text.*;

public class VehicleGo{

     public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
     }

  public static void main(String argv[]){
    Vehicle v = new Vehicle(20000, 2500, 0.10);

    DecimalFormat myFormatter = new DecimalFormat("###,###,###.##");
    String lPrice = myFormatter.format(v.getListPrice());
    String pPrice = myFormatter.format(v.purchasePrice());
    System.out.println("List: " + lPrice + " Purchase Price: " + pPrice);

    v.changeMarkup(1000);
    lPrice = myFormatter.format(v.getListPrice());
    pPrice = myFormatter.format(v.purchasePrice());
    System.out.println("List: " + lPrice + " Purchase Price: " + pPrice);
  }
}
