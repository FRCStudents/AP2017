import java.io.*;

public class ReadSites {

   public static void main(String args[]) throws IOException {
      FileInputStream in = null;
      FileOutputStream out = null;
      String beginLine = "java Mkpwd ";
      try {
         in = new FileInputStream("sites");
         out = new FileOutputStream("listSites");

         int c;
	 for(int i=0; i < beginLine.length(); i++){
	    out.write((int)beginLine.charAt(i));
	 }
         while ((c = in.read()) != -1) {
	    out.write(c);
	    if(c == '\n'){
		for(int i=0; i < beginLine.length(); i++){
			out.write((int)beginLine.charAt(i));
		}
	    }
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


