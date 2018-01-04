package skulbrains;
import java.util.Scanner;

public class User8 implements IUser8a, IUser8b, Comparable {
	private String firstName;
	private String lastName;
	private int userType;
	private boolean sortFirst = false;

	public User8(){
		this("", "", 0);
	}

	public User8(String fName, String lName, int userType){
		firstName = fName;
		lastName = lName;
		this.userType = userType;
	}

	public User8(User8 u){
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

	public void setSortType(boolean val){
		sortFirst = val;
	}

	public int compareTo(Object p){
		User8 u8 = (User8)p;
		String t1;
		String p1;

		if(this.getLastName().equals(u8.getLastName())){
			return 0;
		}

		if(sortFirst){
			t1 = this.getFirstName();
			p1 = u8.getFirstName();
		} else {
			t1 = this.getLastName();
			p1 = u8.getLastName();
		}

		for(int i=0; (i < t1.length() && i < p1.length()); i++){
			if(t1.charAt(i) > p1.charAt(i)){
				return 1;
			}
			if(t1.charAt(i) < p1.charAt(i)){
				return -1;
			}
		}
		return 0;
	}

	public User8 enterNewUser(int uType){
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
