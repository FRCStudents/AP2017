import java.io.*;

public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("APComputerNerd.java");
         out = new FileOutputStream("./tmp");

         int c;
         while ((c = in.read()) != -1) {
            System.out.print(c);
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