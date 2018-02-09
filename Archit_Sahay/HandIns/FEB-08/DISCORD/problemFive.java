import java.util.*;
public class problemFive{

public static boolean secondFunction;
	
public static boolean secondFunction(String a){
	char[] theWord = a.toCharArray();
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

public static void firstFunction(String a) {
			if (secondFunction(a)){ System.out.println("whew"); } 
				else { System.out.println("drag"); }
 }

public static void main(String[] argv){
	Scanner scan = new Scanner(System.in);
		System.out.println  ("put word in lowercase");
		String a = scan.nextLine();
		firstFunction(a);
		secondFunction(a);
}
}//endsDiscord5