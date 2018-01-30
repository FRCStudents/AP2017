import java.io.*;

public class Cat {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;

      try {
         in = new FileInputStream("Snap");
         
         int c;
	 char charHold;
         while ((c = in.read()) != -1) {
	    charHold = (char)c;
            System.out.print(charHold);
         }
      }finally {
         if (in != null) {
            in.close();
         }
      }
   }
}


