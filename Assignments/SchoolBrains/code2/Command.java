package skulbrains;

import java.util.Scanner;
import java.util.*;
import skulbrains.User;
import skulbrains.UserList;

class Command {
 	String stars = "**********************************************";
	String ioStars = "**                                          **";
	UserList userList;

	public boolean doCommand(int command){
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

	public boolean doSubCommand(int command){
		if(command == 1){
			addUser();
			return true;
		}
		if(command == 2){
			removeUser();
			return true;
		}
		if(command == 3){
			listUsers();
			return true;
		}
		return false;
	}

	public void setUserList(UserList uList){
		userList = new UserList();
		for(int i=0; i < uList.size(); i++){
			userList.addUser(uList.getUser(i));
		}
	}

	private void listUsers(){
		for(int i=0; i< userList.size(); i++){
			userList.getUser(i).showUser(i);
		}
	}

	private void removeUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Which student do you want to remove? ");
		int studentNum = s.nextInt();
		userList.deleteUser(studentNum);
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
		userList.addUser(u);
		//u.showUser();
	}

	private void addCourse(){
		System.out.println("Adding a course");
	}
}
