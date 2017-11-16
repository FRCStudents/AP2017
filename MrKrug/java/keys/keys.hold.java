import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class keys{

public static void main(String [] argv){
	try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

	   	while (line.equalsIgnoreCase("quit") == false) {
	       		line = in.readLine();
			if(line.equals("ouch")){
				break;
			}
			System.out.print("\033[H\033[2J");
			System.out.flush();
	   	}

   		in.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
     }
}
