
package skulbrains;

import java.util.Scanner;

class Signon{
	private String fName;
	private String lName;
	private String pWord;

	private String targetFName = "Efraim";
	private String targetLName = "Krug";
	private String targetPWord = "b0st0n";

	int level = 0;
	boolean onSystem = false;

	public Signon(){
		fName = "Efraim";
		lName = "Krug";
		pWord = "b0st0n";
	}

	public void getSignon(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("********************************");
		System.out.println("** First Name: ");
		fName = scanner.next();
		System.out.println("** Last Name: ");
		lName = scanner.next();
		System.out.println("** Password: ");
		pWord = scanner.next();
	}

	public void checkSignon(){
		if(targetFName.equals(fName) &&
			targetLName.equals(lName) &&
			targetPWord.equals(pWord))
			onSystem = true;
	}	

	public boolean isOnSystem(){
		return onSystem;
	}
}	
