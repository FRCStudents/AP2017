/* exploring datatypes */

public class DTypes {
  public static void main(String[] argv){
      char c = 'c';
      short s = 1;
      long l = 1;
      float f = 1;
      double d = 1;
      byte b = 1;
      boolean bl = true;
      int i = 1;

      System.out.print("\nchar: " + c + "\nshort: " + s +
                        "\nlong: " + l + "\nfloat: " + f +
                        "\ndouble: " + d + "\nbyte: " + b +
                        "\nboolean: " + bl + "\nint: " + i);

      short counter = 1;
      System.out.print("\n*** can we figure out how many bits in each?\nInt: ");
      while(i > 0){
          System.out.print("&");
          i <<= 1;
          counter++;
      }

      System.out.print("[" + counter + "]\n\nShort: ");
      counter = 1;
      while(s > 0){
          System.out.print("&");
          s <<= 1;
          counter++;
      }

      System.out.print("[" + counter + "]\n\nLong: ");
      counter = 1;
      while(l > 0){
          System.out.print("&");
          l <<= 1;
          counter++;
      }

      System.out.print("[" + counter + "]\n");

      c *= -1;
      s = -1;
      l = -1;
      f *= -1;
      d *= -1;
      b *= -1;
      i = -1;

      System.out.print("\nchar: " + c + "\nshort: " + s +
                        "\nlong: " + l + "\nfloat: " + f +
                        "\ndouble: " + d + "\nbyte: " + b +
                        "\nboolean: " + bl + "\nint: " + i);



  }
}