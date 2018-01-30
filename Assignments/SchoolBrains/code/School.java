package skulbrains;

import java.util.*;
import skulbrains.User;
import skulbrains.Signon;

class School {
	UserList teacherList = new UserList();
	UserList studentList = new UserList();
	UserList adminList = new UserList();

	Command studentCommand = new Command();
	Command teacherCommand = new Command();
	Command adminCommand = new Command();
	UserMenu userMenu = new UserMenu();
	
	private Signon signOn = new Signon();
 
	public School(){
		signOn.getSignon();
		signOn.checkSignon();
		if(!signOn.isOnSystem()){
			System.out.println("Exit");
		}
		setTestStudents();
		setTestTeachers();
		setTestAdmin();
		runSchoolBrains();
	}

	private void setTestStudents(){
		studentList.addUser("Efraim", "Krug", 3);
		studentList.addUser("Chana", "Krug", 3);
		studentList.addUser("Nancy", "Norton", 3);
	}

	private void setTestTeachers(){
		teacherList.addUser("Chris", "Barb", 2);
		teacherList.addUser("Becky", "Liebels", 2);
		teacherList.addUser("H", "H", 2);
		teacherList.addUser("Bill", "Ells", 2);
	}

	private void setTestAdmin(){
		adminList.addUser("Andrew", "Lay", 1);
		adminList.addUser("Ed", "Lucy", 1);
		adminList.addUser("Mary", "Quinlan", 1);
	}

	public void runSchoolBrains(){
		studentCommand.setUserList(studentList);
		teacherCommand.setUserList(teacherList);
		adminCommand.setUserList(adminList);

		userMenu.printMenu();
		int response = 0;
		int response2 = 0;

		while(response < 5){
			response = userMenu.getInput();
			if(response == 1){
				userMenu.printSubMenu();
				response2 = userMenu.getInput();
				adminCommand.doSubCommand(response2);
			}
			if(response == 2){
				userMenu.printSubMenu();
				response2 = userMenu.getInput();
				teacherCommand.doSubCommand(response2);
			}
			if(response == 3){
				userMenu.printSubMenu();
				response2 = userMenu.getInput();
				studentCommand.doSubCommand(response2);
			}
		userMenu.printMenu();
		}
	}			
			

}
