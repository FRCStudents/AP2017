import java.util.Scanner;
public class driver2{
	
	public static void main(String[] argv){
		HiddenWord2 puzzle = new HiddenWord2("IPHONE");
	
	//SCANNER FOR THE GUESS ON THE USER'S PART
	String a;
	Scanner YourGuess = new Scanner(System.in);
	System.out.println("Type your guess IN ALL CAPS! **6 LETTER MAX**");
	//NOTE--**SIX LETTER MAXIMUM IMPUT**
	a = YourGuess.nextLine();
	
	puzzle.getHint(a); //runs
	System.out.println(puzzle.getHint(a)); //prints
}
}