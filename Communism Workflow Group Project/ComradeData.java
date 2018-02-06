//5th part

import java.io.*;

public class ComradeData{

   public static void main(String[] argv) throws IOException {
     
      FileInputStream input = null;
      FileOutputStream output = null;

      try {
         input = new FileInputStream("Comrades.txt");
         output = new FileOutputStream("Comrades.html");

         int s;
         if((s = input.read()) != -1) {
            output.write(s);
         }

      }finally {
	  }
   }
}