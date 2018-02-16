public class problemEightPartTwo{

public static int fromSeven;

public problemEightPartTwo(int s){
fromSeven = s;
}

public problemEightPartTwo(){
fromSeven = 17;
}

public String toString(){
	return ("Boom here it is: " + fromSeven);
}

public static void main(String[] args){
problemEightPartTwo a = new problemEightPartTwo();
System.out.println(a);
 }

}