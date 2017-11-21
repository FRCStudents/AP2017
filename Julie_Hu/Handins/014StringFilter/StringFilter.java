import java.util.*;

class StringFilter
{

	String SentenceOrig;
	String Spaceless;
    String reMixed;
	
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	 public void reSpace(){
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