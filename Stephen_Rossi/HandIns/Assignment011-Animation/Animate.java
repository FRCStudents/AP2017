public class Animate {
  public static String partOne = "* *";
  public static String partTwo = "\\_/";
  public static void main(String[] args) {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    for(int i = 0; i <= 10; i++){
      for(int count = 0; count < i; count ++){
        System.out.print(" ");
      }
      System.out.println(partOne);
      for(int count = 0; count < i; count ++){
        System.out.print(" ");
      }
      System.out.print(partTwo + "\n\n\n\n\n\n\n\n");
    }
  }
}
