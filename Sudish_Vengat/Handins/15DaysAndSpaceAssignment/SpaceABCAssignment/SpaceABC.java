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
 
 
			public void remixedLettersX(){
				
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
  			public void remixedLettersY(){
				
				mixedAgain = "";
  				
				for(int p = 0; p < SentenceOriginal.length(); p++){
 					if(SentenceOriginal.charAt(p) != '!') {
  						int y = alphabet.indexOf(Character.toLowerCase(SentenceOriginal.charAt(p)));
							if(p != 0){
								mixedAgain += Character.toLowerCase(alphabet.charAt(y + 1));
						}else{
 						 	  	mixedAgain += Character.toUpperCase(alphabet.charAt(y + 1));
 					 	   			}
 				  	} else {
  		 			   	mixedAgain += SentenceOriginal.charAt(p);
      }
	}
  }
 			public void remixedLettersZ(){
				
				mixedAgain = "";
  				
				for(int i = 0; i < SentenceOriginal.length(); i++){
 					if(SentenceOriginal.charAt(i) != '!') {
  						int z = alphabet.indexOf(Character.toLowerCase(SentenceOriginal.charAt(i)));
							if(i != 0){
								mixedAgain += Character.toLowerCase(alphabet.charAt(z + 0));
						}else{
 						 	  	mixedAgain += Character.toUpperCase(alphabet.charAt(z + 0));
 					 	   			}
 				  	} else {
  		 			   	mixedAgain += SentenceOriginal.charAt(i);
      }
	}
  }
}