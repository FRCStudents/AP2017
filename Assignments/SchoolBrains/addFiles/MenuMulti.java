package skulbrains;

import skulbrains.CommandCenter;
import java.util.Scanner;
import java.util.*;

import skulbrains.DataHold;

public class MenuMulti implements IMenuMulti{
	ArrayList<CommandCenter> commandCenterList = new ArrayList<CommandCenter>();
	ArrayList<DataHold> dataHoldList = new ArrayList<DataHold>();

	public MenuMulti(DataHold[] dhArr){
		String[] teacherNames = new String[dhArr.length];

		for(int i=0; i < dhArr.length; i++){
			CommandCenter commandCenter = new CommandCenter(dhArr[i]);
			dataHoldList.add(dhArr[i]);
			commandCenterList.add(commandCenter);
			teacherNames[i] = dhArr[i].getTeacherName();
		}
		runClassRoomMenu(commandCenterList.size(), teacherNames);
	}

	public MenuMulti(DataHold dh){
		CommandCenter commandCenter = new CommandCenter(dh);
		dataHoldList.add(dh);
		commandCenterList.add(commandCenter);
		runApplication(0);
	}

	public MenuMulti(){
		this(new DataHold());
	}
	
	private void runClassRoomMenu(int numClasses, String[] teacherName){
		System.out.println(stars);
		System.out.println(ioStars);
		for(int i=0; i < numClasses; i++){
			System.out.println("** Class Number: " + i + "[" + teacherName[i] + "]");
		}
		System.out.println(ioStars);
		System.out.println(stars);
		System.out.println("Choose a class >>>> ");
		int classRoom = getInput();
		runApplication(classRoom);
	}
	
	public void menu001(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) List Students                       **");
                System.out.println("** 2) List Assignments                    **");
                System.out.println("** 3) List Categories                     **");
		System.out.println("** 99) Exit program                       **");
                System.out.println(ioStars);
                System.out.println(stars);
        }

        public void menu002(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add Student                         **");
                System.out.println("** 2) Remove Student                      **");
                System.out.println("** 3) List Assignments                    **");
		System.out.println("** 99) Exit level                         **");
                System.out.println(ioStars);
                System.out.println(stars);
        }

        public void menu003(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add Student's Score                 **");
                System.out.println("** 2) Remove Score                        **");
                System.out.println("** 3) List Scores                         **");
                System.out.println("** 99) Exit level                         **");
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

	public void runApplication(int classRoom){
		int r = 0;
		while(r < 9){
			menu001();
			r = getInput();
			if(commandCenterList.get(classRoom).doCommand(r)){
				runStudentApp(classRoom);
			}		
		}
	}

	public void runStudentApp(int classRoom){
		int r = 0;
		while(r < 9){
			menu002();
			r = getInput();
			if(commandCenterList.get(classRoom).doStudentCommand(r)){
				runScoresApp(classRoom);
			}
		}
	}

        public void runScoresApp(int classRoom){
                int r = 0;
                if(r < 9){
                        menu003();
                        r = getInput();
                        if(commandCenterList.get(classRoom).doScoresCommand(r)){
				runScoresApp(classRoom);
			}
                }
        }

}

