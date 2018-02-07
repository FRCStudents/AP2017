public class SixDivisor{
      public void sixDivisor(int x){
            if(x % 6 == 0){
                  System.out.println("Hah ha 6-divisor dude");
            }else{
                  System.out.println("(Bummer and a half)");
            }
      }

      public static void main(String[] args){
            SixDivisor sD = new SixDivisor();
            sD.sixDivisor(12);
            sD.sixDivisor(3);
      }
}
