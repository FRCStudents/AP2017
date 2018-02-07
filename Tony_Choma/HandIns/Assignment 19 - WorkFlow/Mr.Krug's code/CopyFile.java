import java.io.*;

public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("./Documents/GitHub/AP2017/Tony_Choma/HandIns/Assignment 18 - APComputerNerd/APCompNerd.java");
         out = new FileOutputStream("./Documents/junk.java");

         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
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
