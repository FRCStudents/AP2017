import java.io.*;
import java.util.*;

class Entry{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = s.nextLine();
        FileOutputStream out = new FileOutputStream(".\\Users\\" + name + ".usr");

        for(int i = 0; i < name.length(); i++) {
            out.write(name.charAt(i));
        }
        out.write('\n');

        System.out.println("Enter Age:");
        String age = s.nextLine();

        for(int i = 0; i < age.length(); i++) {
            out.write(age.charAt(i));
        }
        out.write('\n');

        System.out.println("Enter Grade:");
        String grade = s.nextLine();

        for(int i = 0; i < grade.length(); i++) {
            out.write(grade.charAt(i));
        }
    }
}