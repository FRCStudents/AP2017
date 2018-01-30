package skulbrains;
import java.util.Scanner;

public class User2 implements IUser {
	private String firstName;
	private String lastName;
	private int userType;

	public User2(){
		this("", "", 0);
	}

	public User2(String fName, String lName, int userType){
		firstName = fName;
		lastName = lName;
		this.userType = userType;
	}

	public User2(User u){
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

	public void showUser(){
		System.out.println("[] Name: " + firstName + " " + lastName);
	}
}
