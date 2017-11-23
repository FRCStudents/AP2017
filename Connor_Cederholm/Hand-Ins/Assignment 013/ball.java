import java.util.Scanner;
import java.util.Random;
public class ball{
	public static void main (String [] joeysdad){
	
	Scanner s = new Scanner(System.in);
	Random rand = new Random();
	String question;

	
	
	System.out.println("Type a question to access the mystical powers of the eight ball");
	question = s.next();
		
		int i = rand.nextInt(50) + 1;

	if (i<=5) System.out.println("Concentrate and Ask Again");
	if (5<i && i<=10) System.out.println("Don't count on it");
	if (10<i && i<=15) System.out.println("It is certain");
	if (15<i && i<=20)	System.out.println("Most Likely");
	if (20<i && i <=25) System.out.println("My reply is no");
	if (25<i && i <=30) System.out.println("My sources say no");
	if (30<i && i<=35)System.out.println("No");
	if (35<i && i<=40)System.out.println("Outlook good");
	if (40<i && i<=45)System.out.println("Yes, definetely");
	if (45<i && i<=50)System.out.println("You may rely on it");


	}

}