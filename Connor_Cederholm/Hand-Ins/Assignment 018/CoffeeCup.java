import java.util.*;
public class CoffeeCup{
	ArrayList <ArrayList<Integer>> menu = new ArrayList <ArrayList<Integer>>();
	ArrayList <Integer> price1 = new ArrayList<Integer>();
	ArrayList <Integer> price2 = new ArrayList<Integer>();
	ArrayList <Integer> price3 = new ArrayList<Integer>();
	ArrayList <Integer> price4 = new ArrayList<Integer>();


	public void swapAmount(){
		System.out.println("Input the color and price of the inventory of the cup you would like to update as following: Color, Price");	
		Scanner s = new Scanner(System.in);
			 if(s.next() == "White, 1.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(0).set(0,Integer.valueOf(s.nextInt()));	 
		}
		if(s.nextLine().equals("Black, 1.25")){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(0).set(1,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "Red, 1.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(0).set(2,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "Blue, 1.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(0).set(3,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "White, 2.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(1).set(0,Integer.valueOf(s.nextInt()));
			 	}
		if(s.next() == "Black, 2.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(1).set(1,Integer.valueOf(s.nextInt()));
			 	}
		if(s.next() == "Red, 2.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(1).set(2,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "Blue, 2.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(1).set(3,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "White, 3.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(2).set(0,Integer.valueOf(s.nextInt()));
			 	}
		if(s.next() == "Black, 3.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(2).set(1,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "Red, 3.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(2).set(1,Integer.valueOf(s.nextInt()));	
			 	}
		if(s.next() == "Blue, 3.25"){//White, black, red, ble, 1.25, 2.25, 3.25, 4.99 
			 	System.out.println("How many are there?");
			 	menu.get(2).set(3,Integer.valueOf(s.nextInt()));	
			 	}
			 		System.out.println("Error, please try again");



		}
		public void showMenu(){
			for (int i = 0; i < menu.size(); i++){
		System.out.println(menu.get(i));
		}
	}

		public void createMenu(){
			menu.add(price1);
			menu.add(price2);
			menu.add(price3);
			menu.add(price4);
		}
}