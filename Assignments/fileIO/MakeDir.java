import java.io.File;

// demonstrates how to create a directory in java
public class MakeDir  
{
  public static void main(String[] args)
  {
    File dir = new File("./tmp/TestDirectory");
    
    // attempt to create the directory here
    boolean successful = dir.mkdir();
    if (successful)
    {
      // creating the directory succeeded
      System.out.println("directory was created successfully");
    }
    else
    {
      // creating the directory failed
      System.out.println("failed trying to create the directory");
    }
  }
}

