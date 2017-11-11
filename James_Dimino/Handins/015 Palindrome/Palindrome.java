import java.util.Scanner;

public class Palindrome{
	public static void main(String[] argv){

		String checkSentence;
		int i = 0;
		int z = 0;

			for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        	}

			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Type A Sentence! (No Punctuation or Apostropes)");
			String sentence = scanner1.nextLine();

			checkSentence = sentence.toLowerCase();

			checkSentence = checkSentence.replaceAll("\\s+", "");


			while (i == 0){
					if (checkSentence.charAt(z) == checkSentence.charAt(checkSentence.length() - 1 - z)){
							z++;
						if (z == checkSentence.length()){
							
							for(int b = 0; b <= 80; b++){
            					System.out.print("\n");
        					}

        					System.out.println("You Entered: " + sentence);

        					for(int b = 0; b <= 3; b++){
            					System.out.print("\n");
        					}

							System.out.println("Congrats It's A Palindrome!");
							i++;
						}
				} else {
					
					for(int b = 0; b <= 80; b++){
           				System.out.print("\n");
        			}

        			System.out.println("You Entered: " + sentence);

        			for(int b = 0; b <= 3; b++){
            			System.out.print("\n");
        			}

					System.out.println("That Is Not A Palindrome!");
					i++;
				}
			}

	}
}