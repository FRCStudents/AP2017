import java.util.Scanner;
import java.util.Random;

class MagicEightBall{
	public static void main(String[] argv){

	int repeat = 0;

	while (repeat == 0){

		for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        }
        
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\nAsk A Yes or No Question And See What The Magic Eight Ball Has To Say! \n\n");
		String question = scanner1.nextLine();

		Random rn = new Random();

	for (int z = 0; z < 1; z++){
    	int answer = rn.nextInt(10) + 1;
   				

   		if (answer == 1){
   			System.out.println("\n\nConcentrate and Ask Again");
   		} if (answer == 2){
   			System.out.println("\n\nDon't Count On It");
   		} if (answer == 3){
   			System.out.println("\n\nIt Is Certain");
   		} if (answer == 4){
   			System.out.println("\n\nMost Likely");
   		} if (answer == 5){
   			System.out.println("\n\nMy Reply Is No");
   		} if (answer == 6){
   			System.out.println("\n\nMy Sources Say No");
   		} if (answer == 7){
   			System.out.println("\n\nNo");
   		} if (answer == 8){
   			System.out.println("\n\nOutlook Good");
   		} if (answer == 9){
   			System.out.println("\n\nYes, Definitely");
   		} if (answer == 10){
   			System.out.println("\n\nYou May Rely On It");
   		}

   	}

 		try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }

        for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        }

   		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Would You Like Top Try The Magic Eight Ball Again?\n\nPress 0 -> Ask Again\nPress 1 -> End Program\n");
		int determine = scanner2.nextInt();

		if (determine == 0){

		} if (determine == 1){
			repeat++;
		}
    }

	}
}