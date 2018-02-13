public class LittleAC extends AC{
      @Override
      public void turnOnAC(){
            System.out.println(1);
      }
      public void turnOffAC(){
            System.out.println(0);
      }

      public static void main(String[] args){
            AC p = new LittleAC();
            p.turnOnAC();
            p.turnOffAC();
      }
}
