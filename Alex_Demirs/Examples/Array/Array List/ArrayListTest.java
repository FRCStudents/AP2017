public class ArrayListTest{

  private int arr_size = 5;
  private int[] arr;

  public ArrayListTest(){
       arr_size = 5; 
    arr = new int[5];
    }

  public void changeElt(int val, int i){
    if(i >= 0 && i < arr.length - 1){
        arr[i] = val; 
    }
  }

  public void addElt(int val){
    arr_size++;
    int[] a = new int[arr_size];

    // save the array safely
    for(int i=0; i < arr_size - 1; i++){
        a[i] = arr[i];
    }

    // set new value
    a[arr_size-1] = val;

    //reallocate array
    arr = new int[arr_size];
    for(int i=0; i < arr_size; i++){
        arr[i] = a[i];
    }
  }

  public int getLength(){
    return arr.length;
  }

  public void display(){
    System.out.print("\nArray: ");
    for (int i = 0; i < arr.length; i++){
        System.out.print("[" + arr[i] + "]");
    }
    System.out.println();
  }
}