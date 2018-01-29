import java.io.*;
// https://www.tutorialspoint.com/java/java_exceptions.htm

class FileNotExist extends IOException {
	private String fileName;
	public FileNotExist(String fname){
		System.out.println("Constructor: " + getFileName());
		this.fileName = fname;
	}
	public String getFileName(){
		return fileName;
	}
}

public class CopyFile6 {
   public static FileInputStream openFile(String fname) throws FileNotExist {
	FileInputStream in = null;
	in = new FileInputStream (fname);
	if(in != null){
		return in;
	} else {
		throw FileNotExist(fname);
	}
	return in;
   }	


   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;

      try {
         in = openFile("Snap"); 
         
         int c;
         while ((c = in.read()) != -1) {
            System.out.print((char)c);
         }
      }catch(IOException e) {
	 System.out.println("In catch - there is no file called "); // + e.getFileName());
	 throw new FileNotExist("Snap");
     } finally {
	System.out.println("In the finally block...");
     }
   
   }
}


