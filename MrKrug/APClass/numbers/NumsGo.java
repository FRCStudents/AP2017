package Nums;

public class NumsGo{
  public static void main(String args[]){
    Nums nm3 = new Nums(3,3,3);
    Nums nm5 = new Nums(5,5,5);

    System.out.println("everything set to 3:  ");
    nm3.shortTest();
    nm3.longTest();
    nm3.byteTest();
    System.out.println("Everything set to 5 ");
    nm5.shortTest(); 
    nm5.longTest(); 
    nm5.byteTest(); 
  }
}
