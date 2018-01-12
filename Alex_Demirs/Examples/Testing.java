import java.util.*;

class Testing {
    public static String[] uke = {"My", "Dog", "Has", "A", "Ukelele"};
    public static String[][] shaylaArr1 = new String[4][5];

    public static void main(String[] args) {
        fill2DArr(uke);
        System.out.println(Arrays.deepToString(shaylaArr1));

    }

    public static void fill2DArr(String[] a) {
        String[] placeholder = a;
        for (int row = 0; row < shaylaArr1.length; row++) {
            for (int i = 0; i < placeholder.length; i++) {
                shaylaArr1[row][i] = placeholder[i];
            }

            // advance placeholder 1 pos (move my to end)
            String p = placeholder[0]; // get first String
            for (int i = 1; i < placeholder.length; i++) {
                placeholder[i - 1] = placeholder[i];
            }
            placeholder[placeholder.length - 1] = p;
        }
    }
}