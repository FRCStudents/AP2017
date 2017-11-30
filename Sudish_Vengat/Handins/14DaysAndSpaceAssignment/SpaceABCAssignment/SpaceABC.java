import java.util.*;

public class SpaceABC{

	String SentenceOriginal; 
	String NoSpaces;
	String mixedAgain;
	
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	 public void spaceAgain(){

  		 Scanner scan = new Scanner(System.in);
 		 System.out.println("Enter your sentence: ");
		 SentenceOriginal = scan.nextLine();
		 System.out.println();
 		 System.out.println("Your Sentence: "+ SentenceOriginal);


  	   		String NoSpaces= SentenceOriginal.replaceAll("\\s+","");

			System.out.println();
 		   	System.out.println("Your sentence with no spaces: "+NoSpaces);

					}
 
 
			public void remixedLetters(){
				
				mixedAgain = "";
  				
				for(int b = 0; b < SentenceOriginal.length(); b++){
 					if(SentenceOriginal.charAt(b) != '!') {
  						int x = alphabet.indexOf(Character.toLowerCase(SentenceOriginal.charAt(b)));
							if(b != 0){
								mixedAgain += Character.toLowerCase(alphabet.charAt(x + 2));
						}else{
 						 	  	mixedAgain += Character.toUpperCase(alphabet.charAt(x + 2));
 					 	   			}
 				  	} else {
  		 			   	mixedAgain += SentenceOriginal.charAt(b);
      }
	}
  }
}