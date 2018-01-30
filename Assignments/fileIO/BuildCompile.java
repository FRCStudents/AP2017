import java.io.File;
import java.io.*;

public class BuildCompile {

   public static void main(String[] args) throws IOException {
      File file = null;
      FileOutputStream out = new FileOutputStream("/home/ekrug/bin/emkcompile");
      System.out.println("Created file: /home/ekrug/bin/emkcompile"); 
      String[] paths;
  
      try {      
         file = new File(".");
         paths = file.list();
         for(String path:paths) {
	    if(path.length() < 6) continue;
	    if(path.substring(path.length() - 5).equals(".java")){
		String s = "javac ./tmp2/" + path;
		for(int i=0; i < s.length(); i++){ 
            		out.write(s.charAt(i));	
		}
		out.write('\n');
	    }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
