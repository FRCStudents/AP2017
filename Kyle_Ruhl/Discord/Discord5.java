public class Discord5{

public boolean secondFunction;
	
public boolean secondFunction(String y){
	char[] theWord = y.toCharArray();
		if (theWord[0] == 'a'){
		return true; }
		
		if (theWord[0] == 'e'){
		return true; }

		if (theWord[0] == 'i'){
		return true; }

		if(theWord[0] == 'o'){
		return true;}

		if (theWord[0] == 'u'){
		return true;
		}else{ return false; }
	}

public void firstFunction(String y) {
			if (secondFunction(y)){ System.out.println("whew"); } 
				else { System.out.println("drag"); }
 }
}//endsDiscord5
