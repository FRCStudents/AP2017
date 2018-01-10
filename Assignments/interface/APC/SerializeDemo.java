import java.io.*;
import APCompNerd.APCompNerd;

public class SerializeDemo {

   public static void main(String [] args) {
      APCompNerd acn = new APCompNerd("Gertrude", 10, 12, 9);
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("./tmp/APCompNerd.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(acn);
         out.close();
         fileOut.close();
         System.out.println("\nSerialized data is saved in /tmp/APCompNerd.ser\n\n");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
