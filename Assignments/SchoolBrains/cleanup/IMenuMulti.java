package skulbrains;

import skulbrains.CommandCenter;
import java.util.Scanner;

import skulbrains.DataHold;

public interface IMenuMulti {
        String stars =   "********************************************";
        String ioStars = "**                                        **";

        Scanner scanner = new Scanner(System.in);

	public void menu001();
        public void menu002();
        public void menu003();
        public int getInput();
	public void runApplication(int i);
	public void runStudentApp(int i);
        public void runScoresApp(int classRoom);

}

