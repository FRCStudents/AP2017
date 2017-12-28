package skulbrains;

import skulbrains.CommandCenter;
import java.util.Scanner;

import skulbrains.DataHold;

public class Menu {
        String stars =  "********************************************";
        String ioStars = "**                                       **";

        Scanner scanner = new Scanner(System.in);
	CommandCenter commandCenter;

	public Menu(DataHold dh){
		commandCenter = new CommandCenter(dh);
		runApplication();
	}

	public Menu(){
		this(new DataHold());
	}
	
	public void menu001(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) List Students                      **");
                System.out.println("** 2) List Assignments                   **");
                System.out.println("** 3) List Categories                    **");
		System.out.println("** 99) Exit program                      **");
                System.out.println(ioStars);
                System.out.println(stars);
        }

        public void menu002(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add                                **");
                System.out.println("** 2) Remove                             **");
                System.out.println("** 3) List Assignments                   **");
		System.out.println("** 99) Exit level                        **");
                System.out.println(ioStars);
                System.out.println(stars);
        }

        public void menu003(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add Assignment Score               **");
                System.out.println("** 2) Remove Score                       **");
                System.out.println("** 3) List Scores                        **");
                System.out.println("** 99) Exit level                        **");
                System.out.println(ioStars);
                System.out.println(stars);
        }


        public int getInput(){
		int responseINT = 0;
                System.out.println("Please enter choice: ");
                Scanner s = new Scanner(System.in);
		while((responseINT < 1 || responseINT > 3) && (responseINT != 99)){
                	String responseIN = s.next();
                	responseINT = Integer.parseInt(responseIN);
               	}
		return responseINT;
                }

	private void runApplication(){
		int r = 0;
		while(r < 9){
			menu001();
			r = getInput();
			if(commandCenter.doCommand(r)){
				runStudentApp();
			}		
		}
	}

	private void runStudentApp(){
		int r = 0;
		while(r < 9){
			menu002();
			r = getInput();
			if(commandCenter.doStudentCommand(r)){
				runScoresApp();
			}
		}
	}

        private void runScoresApp(){
                int r = 0;
                while(r < 9){
                        menu003();
                        r = getInput();
                        if(commandCenter.doScoresCommand(r)){
				runScoresApp();
			}
                }
        }

}

