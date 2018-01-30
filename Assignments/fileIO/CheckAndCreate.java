import java.io.File;
public class CheckAndCreate {

   public static void main(String[] args) {
      String newName = "tryIt3";
      boolean freeToUse = true;

      try {
         File file = new File("./tmp");
         String[] fileNames = file.list();
         for(String fname:fileNames) {
	    if(fname.equals(newName)){
		freeToUse = false;
	    } 
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
	
      if(freeToUse){
	   String dirname = "./tmp/" + newName;
           File d = new File(dirname);
      	   d.mkdirs();
      }
      else {
	   System.out.println("Sorry, your file already exists...");
      }
   }  
}
