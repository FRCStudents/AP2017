public class Discord5{

public static boolean secondFunction;
	
public static boolean secondFunction(String y){
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

public static void firstFunction(String y) {
			if (secondFunction(y)){ System.out.println("whew"); } 
				else { System.out.println("drag"); }
 }

public static void main(String[] argv){
	firstFunction("restaurant");
	secondFunction("restaurant");
}
}//endsDiscord5
