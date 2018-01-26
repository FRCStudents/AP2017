
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteString {

private static String lines[] = {"This is the first line, because it is good\n",
				"This is the second line, even though it is good\n",
				"And this is the third line... just because\n"};
	
	public static void main(String[] args) {	
		try {
			File file = new File("test1.txt");
			FileWriter fileWriter = new FileWriter(file);
			for(int i=0; i < 3; i++){
				fileWriter.write(lines[i]);
			}
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

