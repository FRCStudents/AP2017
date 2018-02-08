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

	if(y.charAt(0) == 'a'){
		return x = true;
	}

	if(y.charAt(0) == 'e'){
		return x = true;
	}

	if(y.charAt(0) == 'i'){
		return x = true;
	}

	if(y.charAt(0) == 'o'){
		return x = true;
	}

	if(y.charAt(0) == 'u'){
		return x = true;
	}
	return false;
	}


public static void main (String [] GoBaby){
	String thing = "cpple";
	yayOrNay(check(thing));
}
}