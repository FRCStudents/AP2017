import java.util.Scanner;
import java.util.Random;

public class BottleFlip{
	public static void main(String[] argv){

	int i = 1;

	while(i < 2) {

	System.out.println("\n Welcome To The Bottle Flip Game!\n");

	Scanner reader = new Scanner(System.in);
	System.out.print(" 1 = Normal Flip\n 2 = Cap Flip\n 3 = Learn The Probability \n              >>>");
	int flip = reader.nextInt();

		if (flip == 1){
			Random chance = new Random();

				for(int z = 0; z < 1; z++){
    			
    			int answer = chance.nextInt(100) + 1;
   					if (answer > 49){
   						System.out.print(" __________\n|          \\__\n|           __|\n|__________/\n");
   						System.out.println("Better Luck Next Time!\n");
   					}
   					else {
   						System.out.print(" ___ \n | |  \n/   \\\n|   |\n|   |\n|___|\n");
   						System.out.println("You landed the flip!!!\n");
   					}

			}
			
		}
		else if (flip == 2){
			Random chance = new Random();

				for(int z = 0; z < 1; z++){
    			
    			int answer = chance.nextInt(100) + 1;
   					if (answer > 20){
   						System.out.print(" __________\n|          \\__\n|           __|\n|__________/\n");
   						System.out.println("Better Luck Next Time!\n");
   					}
   					else {
   						System.out.print(" ___\n|   |\n|   |\n|   |\n\\   /\n | | \n ___  \n ");
   						System.out.println("You landed the flip!!!\n");
   					}

			}
		}

		if (flip == 3){

			System.out.println("\n      > In Normal Flip mode, you have a 49% chance to land the flip \n ");
			System.out.println("      > In Cap Flip mode, you have a 20% chance to land the flip \n ");
			
		}


		Scanner determine = new Scanner(System.in);
		System.out.println(" 0 = Try Again\n 1 = I'm Done With This Game\n ");
		int ans = determine.nextInt();


		if (ans == 1){
			i = i + 1;
		}
	
		if (i == 2);

	}

}
}