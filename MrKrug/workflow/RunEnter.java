import java.io.*;

public class RunEnter {
	public static void main(String[] argv)  throws IOException {
		Enter e = new Enter();
		e.runMenu();
		int choice = 0;
		while(choice < 2){
			choice = e.inputChoice();
			e.processInput(choice);
			//e.printLast();
			e.saveFile();
			e.runMenu();
		}
	}
}
