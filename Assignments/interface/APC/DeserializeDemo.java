import java.io.*;
import APCompNerd.APCompNerd;

public class DeserializeDemo {

   public static void main(String [] args) {
      APCompNerd acn = null;
      try {
         FileInputStream fileIn = new FileInputStream("./tmp/APCompNerd.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         acn = (APCompNerd) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("APCompNerd class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized APCompNerd...");
      System.out.println("Name: " + acn.getFirstName());
      System.out.println("Intelligence: " + acn.getIntelligence());
      System.out.println("Speed: " + acn.getSpeed());
      System.out.println("Lap Top Performance: " + acn.getLapTopPerformance());
   }
}
