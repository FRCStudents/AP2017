import java.io.*;

public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;

      try {
         in = new FileInputStream("Snap");
         
         int c;
         while ((c = in.read()) != -1) {
            System.out.print((char)c);
         }
      }finally {
	 System.out.println("In finally");
         if (in != null) {
            in.close();
         }
      }
   }
}


