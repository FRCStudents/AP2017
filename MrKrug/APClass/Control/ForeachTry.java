/**********************************************************
 * notice - you can not update in a foreach
 * loop... you can update the temporary variable...
 * but who cares?
 **********************************************************/
public class ForeachTry{
  public static void main(String [] argv){
    int j = 0;
    int[] arr = new int [20];
    System.out.println();
    for(int i: arr){
        System.out.print("[" + i + "]");
        }
    for(int i: arr){
        i = j;
        arr[j] = j++;
    }
    System.out.println();
    for(int i: arr){
        System.out.print("[" + i + "]");
        }
    System.out.println();
    }
}
