public class PrintLine{
      String line = "**";
      public void printLine(){
            for(int i = 0; i < 15; i++){
                  System.out.print(line);
            }
      }
      public static void main(String[] args){
            PrintLine pL = new PrintLine();
            pL.printLine();
      }
}
