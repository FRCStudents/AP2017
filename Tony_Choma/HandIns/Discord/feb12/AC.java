abstract class AC{
      int AC;
      int BC;

      public abstract void turnOnAC();
      public abstract void turnOffAC();
      public void getAC(){
            turnOnAC();
            turnOffAC();
      }
}
