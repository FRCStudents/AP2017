import java.io.*;

class Users {

    public static void main(String[] args) throws IOException{

        FileInputStream in = null;

        FileOutputStream out = new FileOutputStream("UserList.usrs");

        try {
            File file = new File(".\\UserList\\");

            String[] paths = file.list();

            for(String path:paths) {
                in = new FileInputStream(".\\UserList\\" + path);
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