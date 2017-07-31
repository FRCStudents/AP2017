/*
 * String work...
 * I don't think you can add two char, and I
 * am partially correct. If there is a String
 * concatenated before the chars, then everything
 * seems to get converted to a String.
 *
 * But, if there is no String - then the char are
 * converted to their numerical equivelant (ASCII)
 */

public class StringChar {
 public static void main(String argv[]){
  char c1, c2;
  c1 = 'a';
  c2 = 'b';
  System.out.println(c1 + ":" + c2 + "|" + c1 + c2);
  System.out.println(c1 + c2);
  System.out.println(c1);
 }
}
