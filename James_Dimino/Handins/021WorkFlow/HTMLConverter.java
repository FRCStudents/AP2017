import java.io.*;

class DataHTMLize {
   static String beginHTML = "<HTML><HEAD><link rel=\"stylesheet\" type=\"text/css\" href=\"DATA.CSS\">\n\t<TITLE>Html Build</TITLE></HEAD>\n";
   static String beginHTML2 = "<BODY><DIV class=BODY><H1>Serious Data</H1><br><DIV CLASS=table><TABLE>";
   static String beginHTML3 = "\n<TR><TH>Name</TH><TH>Age</TH><TH>Height</TH><TH>Shoe Size</TR><TR><TD class=big>";
   static String endHTML = "</TD></TR></TABLE></DIV></DIV></BODY></HTML>";
   
   static void doBeginHTML(FileOutputStream out)  throws IOException{
	String begin = beginHTML + beginHTML2 + beginHTML3;
        for(int i=0; i<begin.length(); i++){
                out.write(begin.charAt(i));
        }
   }

   static void doEndHTML(FileOutputStream out)  throws IOException{
        for(int i=0; i < endHTML.length(); i++){
                out.write(endHTML.charAt(i));
        }
   }

   static void doCell(FileOutputStream out)  throws IOException {
	String endCell = "</TD><TD>";
	for(int i=0; i<endCell.length(); i++){
		out.write(endCell.charAt(i));
	}
   }

   static void doLine(FileOutputStream out)  throws IOException {
        String endLine = "</TR>\n<TR><TD class=big>";
        for(int i=0; i<endLine.length(); i++){
                out.write(endLine.charAt(i));
        }
   }

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
