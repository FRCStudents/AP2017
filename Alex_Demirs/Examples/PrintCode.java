import java.io.*;

public class PrintCode {

   public static void main(String args[]) throws IOException {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("Revolution.java");

         int c;
         while ((c = in.read()) != -1) {
            System.out.println(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}