package skulbrains;

public class User implements IUser {
	private String firstName;
	private String lastName;
	private int userType;

	public User(){
		this("", "", 0);
	}

	public User(String fName, String lName, int userType){
		firstName = fName;
		lastName = lName;
		this.userType = userType;
	}

	public User(User u){
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

	public void showUser(int num){
		System.out.println("[" + num + "] Name: " + firstName + " " + lastName);
		//System.out.println("*********************");
		//System.out.println("** Number: " + num);
		//System.out.println("** First: " + firstName);
		//System.out.println("** Last: " + lastName);
		//System.out.println("** Type: " + userType);
	}
}
