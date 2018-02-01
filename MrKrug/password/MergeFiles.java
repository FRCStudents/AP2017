import java.io.*;

public class MergeFiles {

   private static void readFile(FileInputStream in, FileOutputStream out) throws IOException{
      int c;
      try {
      c = in.read();
      while ((c != '\n') && (c != -1)) {
		if(c != '[' && c != ']'){
			out.write(c);
		}
	     c = in.read();
      }
     } catch (Exception e){
	e.printStackTrace();
     }
   }

   public static void main(String args[]) throws IOException {
      FileInputStream in1 = null;
      FileInputStream in2 = null;
      FileOutputStream out = null;

      try {
         in1 = new FileInputStream("sites");
	 in2 = new FileInputStream("siteFile");
         out = new FileOutputStream("listing");

         int c;
         while ((c = in1.read()) != -1) {
		out.write(c);
		readFile(in1, out);
		out.write('\t');
		readFile(in2, out);
		out.write('\n');
         }
      }finally {
         if (in1 != null) {
            in1.close();
         }
	 if (in2 != null) {
	    in2.close();
	 }
         if (out != null) {
            out.close();
         }
      }
   }
}


