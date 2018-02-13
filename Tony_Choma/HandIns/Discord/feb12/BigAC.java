public class BigAC extends AC{
      @Override
      public void turnOnAC(){
            System.out.println(10);
      }
      public void turnOffAC(){
            System.out.println(-10);
      }

      public static void main(String[] args){
            AC p1 = new BigAC();
            p1.turnOnAC();
            p1.turnOffAC();
      }
}
