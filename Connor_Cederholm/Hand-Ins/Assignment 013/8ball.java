import java.util.Scanner;
import java.util.Random;
public class 8ball{
	public static void main (String [] joeysdad){
	
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("What do you wish to know?");
		
		int i = rand.nextInt(50) + 1;

	if (i<=5) System.out.println("Concentrate and Ask Again");
	if (5<i<=10) System.out.println("Don't count on it");
	if (10<i<=15) System.out.println("It is certain");
	if (15<i<=20)	System.out.println("Most Likely");
	if (20<i<=25) System.out.println("My reply is no");
	if (25<i<=30) System.out.println("My sources say no");
	if (30<i<=35)System.out.println("No");
	if (35<i<=40)System.out.println("Outlook good");
	if (40<i<=45)System.out.println("Yes, definetely");
	if (45<i<=50)System.out.println("You may rely on it");

	}

}