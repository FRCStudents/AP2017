import java.io.*;

public class HTMLConverterDriver {
  public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("./InfoStorage/all.txt");
         out = new FileOutputStream("./InfoStorage/allHTML.html");
         doBeginHTML(out); 
         int c;
         while ((c = in.read()) != -1) {
	         if(c == '~'){
		        doCell(out);
		        continue;
	         }
	         if(c == '\n'){
		        doLine(out);
		        continue;
	         }
            out.write(c);
        }
        } finally {
            doEndHTML(out);
              if (in != null) {
                in.close();
              }
              if (out != null) {
                out.close();
              }

          }
  }
}
