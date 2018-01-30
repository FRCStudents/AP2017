package skulbrains;
import java.util.Scanner;

public class User4 implements IUser {
	private String firstName;
	private String lastName;
	private int userType;

	public User4(){
		this("", "", 0);
	}

	public User4(String fName, String lName, int userType){
		firstName = fName;
		lastName = lName;
		this.userType = userType;
	}

	public User4(User4 u){
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

	public IUser enterNewUser(int uType){
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
		System.out.println("Name: And this is after a compile/recompile: " + firstName + " " + lastName);
	}
}
