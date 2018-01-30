package skulbrains;

import java.util.Scanner;
import java.util.*;
import skulbrains.User;

class Menu {
 	String stars = "**********************************************";
	String ioStars = "**                                          **";
	ArrayList<User> userList = new ArrayList<User>();
	public Menu(){
		int i = 0;
	}

	public void printMenu(){
		System.out.println(stars);
		System.out.println(ioStars);
		System.out.println("** 1) Add User                              **");
		System.out.println("** 2) List Users                            **");
		System.out.println("** 3) Add Course                            **");
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

	public void runMenu(){
		boolean theRun = true;
		while(theRun){
			printMenu();
			if(!doCommand(getInput())){
				theRun = false;
			}	
		}
	}

	private boolean doCommand(int command){
		if(command == 1){
			addUser();
			return true;
		}
		if(command == 2){
			listUsers();
			return true;
		}
		if(command == 3){
			addCourse();
			return true;
		}
		return false;
	}

	private void listUsers(){
		for(int i=0; i< userList.size(); i++){
			userList.get(i).showUser();
		}
	}
	
	private void addUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the new user's first name: ");
		String fName = s.next();
		System.out.println("Enter the new user's last name: ");
		String lName = s.next();
		System.out.println("1: Admin; 2: Teacher; 3: Student");
		int userType = Integer.parseInt(s.next());
		User u = new User(fName, lName, userType);
		userList.add(u);
		//u.showUser();
	}

	private void addCourse(){
		System.out.println("Adding a course");
	}
}
