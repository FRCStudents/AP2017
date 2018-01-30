import java.util.*;

public class SpaceFilter{

	String OriginalSentence; 
	String NoSpaces;
	String Increment;
	
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	 public void WithoutSpaces(){

  		 Scanner scan = new Scanner(System.in);
 		 System.out.println("Give to me your sentence!");
		 OriginalSentence = scan.nextLine();
		 System.out.println();


  	   		String NoSpaces= OriginalSentence.replaceAll("\\s+","");

			System.out.println();
 		   	System.out.println("Result: "+NoSpaces);

					}
 
 
			public void Incrementer(){
				
				Increment = "";
  				
				for(int z = 0; z < OriginalSentence.length(); z++){
 					if(OriginalSentence.charAt(z) != '!') {
  						int x = alphabet.indexOf(Character.toLowerCase(OriginalSentence.charAt(z)));
							if(z != 0){
								Increment += Character.toLowerCase(alphabet.charAt(x + 2));
						}else{
 						 	  	Increment += Character.toUpperCase(alphabet.charAt(x + 2));
 					 	   			}
 				  	} else {
  		 			   	Increment += OriginalSentence.charAt(z);
      }
	}
  }
}