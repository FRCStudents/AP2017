import java.util.*;

class coffeeCup{
	public static void main (String [] argv){

	ArrayList <ArrayList <Integer>> cups = new ArrayList<ArrayList <Integer>>();
	
	//public coffeeCup(){
		ArrayList <Integer> white = new ArrayList<Integer>();
		ArrayList <Integer> black = new ArrayList<Integer>();
		ArrayList <Integer> red = new ArrayList<Integer>();
		ArrayList <Integer> blue = new ArrayList<Integer>();
		
		white.add(4);
		white.add(3);
		white.add(7);
		white.add(5);
		cups.add(white);
		black.add(4);
		black.add(6);
		black.add(6);
		black.add(5);
		cups.add(black);
		red.add(3);
		red.add(3);
		red.add(3);
		red.add(5);
		cups.add(red);
		blue.add(6);
		blue.add(6);
		blue.add(5);
		blue.add(5);
		cups.add(blue);
		System.out.println(cups);
		//}
	
}
	
}
