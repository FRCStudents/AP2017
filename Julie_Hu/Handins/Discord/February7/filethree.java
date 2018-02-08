//Question 3: Write a function that accepts a String, and prints out: "This is the "string", you know:(parameter here)"
public class filethree{
      public void acceptString(String line){
            System.out.println("This is the \"String\", you know:" + line);
      }

      public static void main(String[] args){
            filethree aS = new filethree();
            aS.acceptString("parameter");
      }
}
