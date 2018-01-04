package skulbrains;
import java.util.Scanner;

public class User7 implements IUser7a, IUser7b, Comparable {
	private String firstName;
	private String lastName;
	private int userType;

	public User7(){
		this("", "", 0);
	}

	public User7(String fName, String lName, int userType){
		firstName = fName;
		lastName = lName;
		this.userType = userType;
	}

	public User7(User7 u){
		firstName = u.getFirstName();
		lastName = u.getLastName();
		userType = u.getUserType();
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public int getUserType(){
		return userType;
	}

	public int compareTo(Object p){
		User7 u7 = (User7)p;
		if(this.getUserType() < u7.getUserType()){
			return -1;
		}
		if(this.getUserType() > u7.getUserType()){
			return 1;
		}
		return 0;
	}

	public User7 enterNewUser(int uType){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first name: ");
		firstName = scanner.next();	
		System.out.println("Enter last name: ");
		lastName = scanner.next();
		userType = uType;
		return this;
	}

	public void showUser(int num){
		System.out.println("[" + num + "] Name: " + firstName + " " + lastName);
	}
	
	public void showUser(){
		System.out.println("Name: " + firstName + " " + lastName);
	}
}
