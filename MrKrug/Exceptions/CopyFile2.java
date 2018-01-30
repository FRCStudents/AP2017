import java.io.*;

public class CopyFile2 {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;

      try {
         in = new FileInputStream("Snap");
         
         int c;
         while ((c = in.read()) != -1) {
            System.out.print((char)c);
         }
      }catch(IOException e) {
	 System.out.println("In catch - there is no file called 'Snap'");
         if (in != null) {
            in.close();
         }
      }
   }
}


