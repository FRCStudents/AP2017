import java.util.*;

public class file5{

public static void yayOrNay(boolean x){
if(x == true){
	System.out.print("whew");
}else{
	System.out.print("drag");
}
}

public static boolean check(String y){
boolean x;

	if(y.charAt(0) == 'a' || y.charAt(0) == 'A'){
		return x = true;
	}

	if(y.charAt(0) == 'e' || y.charAt(0) == 'E'){
		return x = true;
	}

	if(y.charAt(0) == 'i' || y.charAt(0) == 'I'){
		return x = true;
	}

	if(y.charAt(0) == 'o' || y.charAt(0) == 'O'){
		return x = true;
	}

	if(y.charAt(0) == 'u' || y.charAt(0) == 'U'){
		return x = true;
	}
	return false;
	}



public static void main (String [] GoBaby){
	
	yayOrNay(check("apple"));
}
}