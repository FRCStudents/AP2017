// **This code is heavily influenced by Tom's because idk HTML lol, FYI**
import java.io.*;
import java.awt.Desktop;
import java.net.*;

public class HTMLize {

	private static FileInputStream in = null;
	private static FileOutputStream out = null;
	private static int c;
	private static String start_html = "<!DOCTYPE html><html><head><title><People</title></head><body>" +
		"<table><tr><th>NAME</th><th>SPEED (mph)</th><th>AGE</th><th>OCCUPATION</th><th>HEIGHT (in)</th>" +
		"<th>SHOE SIZE</th><th>HAT SIZE</th></tr><tr><td>";
	private static String end_html = "</table></body></html>";
	private static final String end_data = "</td>";
	private static final String end_row = "</tr>";
	private static final String start_data = "<td>";
	private static final String start_row = "<tr><td>";

	public static void doIt() throws IOException {

		// write out start of HTML file
		for (int i = 0; i < start_html.length(); i++) {
			out.write(start_html.charAt(i));
		}

		boolean new_data = false;
		boolean new_row = false;

		while ((c = in.read()) != -1) {

			if (c == '|') {
				// end the data

				new_data = true; // sets up so next char will come in new cell
				for (int i = 0; i < end_data.length(); i++) {
					out.write(end_data.charAt(i));
				}

			} else if (c == '*') {
				// end the row

				new_row = true; // sets up so next char will come in new cell in new row
				for (int i = 0; i < end_row.length(); i++) {
					out.write(end_row.charAt(i));
				}

			} else {
				// start the row or data if necessary

				if (new_data) {
					for (int i = 0; i < start_data.length(); i++) {
						out.write(start_data.charAt(i));
					}
					new_data = false; // reset so that it's not infinite

				} else if (new_row) {
					for (int i = 0; i < start_row.length(); i++) {
						out.write(start_row.charAt(i));
					}
					new_row = false; // reset
				}

				// write the data itself
				out.write(c);
			}
		}

		// write the end of HTML file
		for (int i = 0; i < end_html.length(); i++) {
			out.write(end_html.charAt(i));
		}
	}

	public static void main(String[] argv) throws IOException {

		in = new FileInputStream("./All.pls");
		out = new FileOutputStream("./All.html");

		doIt();

		File file = new File("./All.html");
		Desktop.getDesktop().browse(file.toURI());
	}
}


/* NOTE TO SELF:
<html>
	<head><title>People</title></head>
	<body>
		<table>
			<tr><th>Name></th><th>Speed</th></tr>
			<tr><td>Nicole</td><td>5 mph</td></tr>
		</table>
	</body>
</html>
*/
