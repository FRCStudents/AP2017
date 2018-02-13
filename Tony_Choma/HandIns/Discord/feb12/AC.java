abstract class AC{
      int AC;
      int BC;

      public abstract void turnOnAC();
      public abstract void turnOffAC();
      public void getAC(){
            turnOnAC();
            turnOffAC();
      }
      public void putInBox(){
            System.out.println("**********************");
            System.out.println("*         " + turnOnAC() + "          *");
            System.out.println("*         " + turnOffAC() + "          *");
            System.out.println("**********************");
      }
}
