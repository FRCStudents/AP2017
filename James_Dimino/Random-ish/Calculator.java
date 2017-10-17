import java.util.Scanner;
import java.util.Random;

public class Calculator{
	public static void main(String[] argv){

	int i = 1;

		while(i < 2) {

// Asks user what function they would like to use
	Scanner scanner1 = new Scanner(System.in);
	System.out.print("What Would You Like To Do? \n 1 = Calculator \n 2 = Random Number Generator \n              >>>");
	int ans1 = scanner1.nextInt();

	if (ans1 == 1){
		System.out.print("Running Calculator... \n");


// Asks user for the first number they would like to use
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter The First Number You Would Like To Use! \n              >>>");
	int num01 = reader.nextInt();
	
// Asks user for the second number they would like to use
	Scanner reader2 = new Scanner(System.in);
	System.out.print("Enter The Second Number You Would Like To Use! \n              >>>");
	int num02 = reader.nextInt();

// Asks user for the opetation they would like to perform
	Scanner reader3 = new Scanner(System.in);
	System.out.print(" 1 = Add \n 2 = Multiply \n 3 = Divide \n 4 = Remainder \n 5 = Square Both Numbers \n ");
	int num03 = reader.nextInt();

// Adds two numbers
		if (num03 == 1){
			System.out.println("\n              >>>" + (num01 + num02));
		}
// Multiplies two numbers
		else if (num03 == 2){
			System.out.println("\n              >>>" + (num01 * num02));
		}
// Divides two numbers
		else if (num03 == 3){
			System.out.println("\n              >>>" + (num01 / num02));
		}
// Finds the remainder of two numbers
		else if (num03 == 4){
			System.out.println("\n              >>>" + (num01 % num02));
		}
// Squares the two numbers
		else if (num03 == 5){
			System.out.println("\n              >>>" + (num01 * num01));
			System.out.println("\n              >>>" + (num02 * num02));
		}
	}

	else if (ans1 == 2){
		System.out.print("Running Random Number Generator... \n");

		Scanner scanner01 = new Scanner(System.in);
		System.out.println(" 1 = 1-10 \n 2 = 1-100 \n 3 = 1-1000");
		int ans2 = scanner01.nextInt();
// Generates a number between 1 and 10
			if (ans2 == 1){
				Random rn = new Random();

				for(int z = 0; z < 1; z++){
    			
    			int answer = rn.nextInt(10) + 1;
   				System.out.println("\n              >>>" + answer);
			}
			
		}
// Generates a number between 1 and 100
			else if (ans2 == 2){
				Random rn = new Random();

				for(int z = 0; z < 1; z++){

    			int answer2 = rn.nextInt(100) + 1;
    			System.out.println("\n              >>>" + answer2);
			}
 
		}
// Generates a number between 1 and 1000
			else if (ans2 == 3){
				Random rn = new Random();

				for(int z = 0; z < 1; z++){

    			int answer3 = rn.nextInt(1000) + 1;
    			System.out.println("\n              >>>" + answer3);
			}
		}
	}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Press 0 To Run Program Again! Press 1 To End The Program. \n              >>>");
		int ans = scanner.nextInt();

		if (ans == 1){
			i = i + 1;
		}
	
		if (i == 2);
		
	
		}
	}
}
