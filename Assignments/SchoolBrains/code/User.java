package skulbrains;

class User {
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

	public void showUser(int num){
		System.out.println("*********************");
		System.out.println("** Number: " + num);
		System.out.println("** First: " + firstName);
		System.out.println("** Last: " + lastName);
		System.out.println("** Type: " + userType);
	}
}
