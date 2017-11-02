import java.util.*;

class spaceABC{

	String SentenceOrig; //the originally imputed sentence
	String Spaceless;//the sentence with spaces removed
    String reMixed;//the sentence with the new alphabet installed
	
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	 public void reSpace(){
 	
	/*
	*
	*This is getting the sentence from the user using the scanner
	*and is also getting rid of the spaces
	*and prints out both the original sentence
	*and the space-less sentence
	*
	*/

  		 Scanner scan = new Scanner(System.in);
 		 System.out.println("Enter your sentence: ");
		 SentenceOrig = scan.nextLine();
		 System.out.println();
 		 System.out.println("Your Sentence: "+ SentenceOrig);


  	   		String Spaceless= SentenceOrig.replaceAll("\\s+","");

			System.out.println();
 		   	System.out.println("Your Space-less Sentence: "+Spaceless);
					}
 
 
			public void remixLetters(){
				
				/*
				*
				*This changes the letters and re-mixes them, 
				*adding two to each letter
				*for example, a = c or l = n
				*
				*Print out for the re-mixed sentence is located
				*in spaceABCDriver.java
				*
				*/
				
				reMixed = "";
  				
				for(int i = 0; i < SentenceOrig.length(); i++){
 					if(SentenceOrig.charAt(i) != '!') {
  						int x = alphabet.indexOf(Character.toLowerCase(SentenceOrig.charAt(i)));
							if(i != 0){
								reMixed += Character.toLowerCase(alphabet.charAt(x + 2));
						}else{
 						 	  	reMixed += Character.toUpperCase(alphabet.charAt(x + 2));
 					 	   			}
 				  	} else {
  		 			   	reMixed += SentenceOrig.charAt(i);
      }
	}
  }
}