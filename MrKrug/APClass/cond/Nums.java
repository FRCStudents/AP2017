package Nums;

public class Nums{
  private int a;
  private int b;

  public Nums(int a, int b){
      this.a = a;
      this.b = b;
  }

  public void test01(){
	if(!(!( a != b) && (b > 7))){
		System.out.println(a + "," + b + ": First test - true");
		}
	else {
		System.out.println(a + "," + b + ": First test - false");
	}
  }

  public void test02(){
        if((a != b) || (b <= 7)){
                System.out.println(a + "," + b + ": Second test - true");
                }
        else {
                System.out.println(a + "," + b + ": Second test - false");
        }
  }

}
