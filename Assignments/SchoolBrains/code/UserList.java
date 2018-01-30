package skulbrains;
import java.util.*;
import skulbrains.User;

class UserList {
	private ArrayList<User> uList = new ArrayList<User>();
	// type: 1 - admin; 2 - teacher; 3 - student
	private int type = 0;

	public UserList(){

	}

	public void listUsers(){
		for(int i=0; i< uList.size(); i++){
			System.out.println("---------- # " + i + " ---------------");
			uList.get(i).showUser(i);
		}
	}

	public void deleteUser(int i){
		uList.remove(i);
	}
 
	public int size(){
		return uList.size();
	}
	
	public void addUser(String fName, String lName, int userType){
		User u = new User(fName, lName, userType);
		uList.add(u);
	}

	public void deleteAll(){
		uList = new ArrayList<User>();
	}

	public void addUser(User u){
		uList.add(u);
	}

	public User getUser(int i){
		return uList.get(i);
	}
}
