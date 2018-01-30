import java.io.File;
public class CreateDir {

   public static void main(String[] args) {
      String dirname = "./tmp/tryIt";
      if(args.length > 0)
	{
		dirname = "./tmp/" + args[0];
 	}
      File d = new File(dirname);
      
      // Create directory now.
      d.mkdirs();
   }
}

