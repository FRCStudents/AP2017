public class AcceptString{
      public void acceptString(String line){
            System.out.println("This is the \"String\", you know:" + line);
      }

      public static void main(String[] args){
            AcceptString aS = new AcceptString();
            aS.acceptString("FAKAFAK");
      }
}
