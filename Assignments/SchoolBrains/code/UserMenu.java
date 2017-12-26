package skulbrains;

import java.util.Scanner;
import java.util.*;
import skulbrains.User;

class UserMenu {
 	String stars = "**********************************************";
	String ioStars = "**                                       **";
	ArrayList<User> userList = new ArrayList<User>();
	public UserMenu(){
		int i = 0;
	}

	public void printMenu(){
		System.out.println(stars);
		System.out.println(ioStars);
		System.out.println("** 1) Admin                              **");
		System.out.println("** 2) Teachers                           **");
		System.out.println("** 3) Students                           **");
		System.out.println(ioStars);
		System.out.println(stars);
	}

	public void printSubMenu(){
                System.out.println(stars);
                System.out.println(ioStars);
                System.out.println("** 1) Add                                **");
                System.out.println("** 2) Remove                             **");
                System.out.println("** 3) List                               **");
                System.out.println(ioStars);
                System.out.println(stars);
	}

	public int getInput(){
		System.out.println("Please enter choice: ");
	        Scanner s = new Scanner(System.in);
        	String responseIN = s.next();
		int responseINT = Integer.parseInt(responseIN);
		return responseINT;
		}

	public void runMenu(Command c){
		boolean theRun = true;
		while(theRun){
			printMenu();
			if(!c.doCommand(getInput())){
				theRun = false;
			}	
		}
	}

}
