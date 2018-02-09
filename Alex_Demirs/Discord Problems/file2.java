public class file2{

  static String star = "*";

 public static void star(){
 	System.out.print(star);
 }

public static void manyStar(){
	int x;
	for(x=0;x<=100;x++){
		star();
	}
}


public static void main (String [] GoBaby){
	manyStar();
}
}