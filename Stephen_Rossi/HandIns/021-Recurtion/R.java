public class R{
  private int[] arr = new int[10];

  public void fillArr(){
    for(int i = 0; i < arr.length; i++){
      this.arr[i] = i + 1;
    }
  }
  public void printArr(){
    for(int i = 0; i < arr.length; i++){
      System.out.print(this.arr[i]);
    }
  }
  public void printArrB(){
    for(int i = arr.length - 1; i >= 0; i--){
      System.out.print(this.arr[i]);
    }
  }
  public int printArrR(int n){
    if(n == 0) return n;
    System.out.print(arr[printArrR(n-1)]);
    return n;
  }
  public static void main(String[] argv){
    R r = new R();
    r.printArr();
    //System.out.println();
    r.fillArr();
    //System.out.println();
    r.printArr();
    System.out.println();
    //r.printArrB();
    //System.out.println();
    r.printArrR(10);
  }
}
