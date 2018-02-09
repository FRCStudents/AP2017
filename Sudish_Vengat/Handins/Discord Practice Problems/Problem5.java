import java.util.*;

public class Problem5{

	public static void word(boolean i){
	if(i == true){
		System.out.print("Whew");
	} else {
		System.out.print("Drag");
	}
}

	public static boolean wordCheck(String s){
	boolean j;

		if(s.charAt(0) == 'a' || s.charAt(0) == 'A' || s.charAt(0) == 'e' || s.charAt(0) == 'E' || s.charAt(0) == 'i' || s.charAt(0) == 'I' || s.charAt(0) == 'o' || s.charAt(0) == 'O' || s.charAt(0) == 'u' || s.charAt(0) == 'U'){
			return j = true;
		}
			return false;
		}


	public static String getString(){
		Scanner input = new Scanner(System.in); 
		String Input = input.nextLine();
		return Input;
	}

	public static void main(String[] args){
		word(wordCheck(getString()));
	}
}