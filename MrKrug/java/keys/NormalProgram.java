import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NormalProgram{

public static void main(String [] argv){
        try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String line = "";

		Runtime r = Runtime.getRuntime();
		Process p = r.exec("ls");
	
                while (line.equalsIgnoreCase("quit") == false) {
              		System.out.println("Would you like to play this fun game?"); 
		        line = in.readLine();
     			System.out.println("Okie dokie... the answer is: " + line); 
	        }

                in.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
     }
}
