import java.io.*;

public class CopyFile5 {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      boolean fileOpen = false;

      try {
         in = new FileInputStream("Snap");
         
         int c;
         while ((c = in.read()) != -1) {
            System.out.print((char)c);
	    fileOpen = true;
         }
	 System.out.println("Throwing IOException...");
	 throw new IOException();
      } catch (IOException e){
	 System.out.println("In the catch routine...");
      }
   }
}


