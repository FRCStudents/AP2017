//6th part

import java.io.*;

public class ComradeDataReader {

   public static void main(String args[]) throws IOException {
      
      FileReader input = null;
      FileWriter output = null;

      try {
         input = new FileReader("Comrades.txt");
         output = new FileWriter("Comrades.html");
         
         int s;
         while ((s = input.read()) != -1) {
            output.write(s);
         }

      }finally {
         if(input != null) {
            input.close();
         }

         if (output != null) {
            output.close();
         }
      }
   }
}