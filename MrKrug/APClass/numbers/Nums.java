package Nums;

public class Nums{
  private short a;
  private long b;
  private byte c;

  public Nums(int a, int b, int c){
      this.a = (short)a;
      this.b = (long)b;
      this.c = (byte)c;
  }

  public void shortTest(){
	if(a == 3){
		System.out.println("THREE - worked");
		}
	else {
		System.out.println("NOT THREE - in else");
	}
  }

  public void longTest(){
        if(b == 3){
                System.out.println("THREE - worked");
                }
        else {
                System.out.println("NOT THREE - in else");
        }
  }

  public void byteTest(){
        if(c == 3){
                System.out.println("THREE - worked");
                }
        else {
                System.out.println("NOT THREE - in else");
        }
  }

}
