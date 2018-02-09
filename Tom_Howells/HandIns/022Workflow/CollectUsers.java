import java.io.*;

class CollectUsers {
    // create array of file names
    // loop through them and add to new file in single line each, separated by spaces

    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = new FileOutputStream("Users.usrs");
        try {
            File file = new File(".\\Users\\");
            String[] paths = file.list();
            for(String path:paths) {
                in = new FileInputStream(".\\Users\\" + path);
                int c;
                while ((c = in.read()) != -1) {
                    if (c != '\n') {
                        out.write(c);
                    } else {
                        out.write('*');
                    }
                }
                out.write('\\');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}