package skulbrains;

public class AppRun6 {
	public static void main(String [] argv){ 
		User6 u = new User6("Bill", "Smith", 0);
		u.showUser(); 
		User6 u2 = u.enterNewUser(3);
		u2.showUser();
	}
	
}

