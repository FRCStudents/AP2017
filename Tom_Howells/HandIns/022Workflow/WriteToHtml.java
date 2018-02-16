import java.io.*;

class WriteToHtml {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("Users.usrs");
        FileOutputStream out = new FileOutputStream("Users.html");
        String start = "<!DOCTYPE html><html><head><title>USERS</title></head><body><table><tr><th>NAME</th><th>AGE</th><th>GRADE</th></tr><tr><td>";
        String end = "</table></body></html>";

        for(int i = 0; i < start.length(); i++) {
            out.write(start.charAt(i));
        }

        int c;
        boolean flag1 = false; //<td>
        boolean flag2 = false; //<tr>
        // if flags are true add in the thing if val exists next
        while ((c = in.read()) != -1) {
            if (c == '*') {
                flag1 = true;

                String w = "</td>";
                for(int i = 0; i < w.length(); i++) {
                    out.write(w.charAt(i));
                }

            } else if (c == '\\') {
                flag2 = true;

                String w = "</tr>";
                for(int i = 0; i < w.length(); i++) {
                    out.write(w.charAt(i));
                }

            } else {
                if (flag1) {
                    String w = "<td>";
                    for(int i = 0; i < w.length(); i++) {
                        out.write(w.charAt(i));
                    }
                    flag1 = false;
                } else if (flag2) {
                    String w = "<tr><td>";
                    for(int i = 0; i < w.length(); i++) {
                        out.write(w.charAt(i));
                    }
                    flag2 = false;
                }

                out.write(c);
            }
        }

        for(int i = 0; i < end.length(); i++) {
            out.write(end.charAt(i));
        }
    }
}