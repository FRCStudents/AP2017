import java.io.*;
public class CopyFile2 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("./tmp/tryIt/junk.java");
         out = new FileWriter("./tmp/tryIt/junk2.java");
         
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


