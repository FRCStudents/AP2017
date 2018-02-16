public class TwoAttributes{
      int a;
      int b;

      public TwoAttributes(int newA, int newB){
            setA(newA);
            setB(newB);
      }
      public TwoAttributes(){
            this(0,0);
      }

      public int getA(){
            return a;
      }
      public int getB(){
            return b;
      }

      public void setA(int newA){
            a = newA;
      }
      public void setB(int newB){
            b = newB;
      }


}
