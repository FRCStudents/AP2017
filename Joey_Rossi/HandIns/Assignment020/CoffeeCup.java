public class CoffeeCup {
	int cost;
	String color;
	int cup;
	String type;

	final String[] color = {"White", "Black", "Red", "Blue"};
	final String[] type = {"Decaf", "Caffeine"};

	ArrayList<ArrayList<Integer>> arrL = new ArrayList<Integer>();
		arrL.add(5);
		//[5]
		arrL.add(3);
		//[5][3]

	int getCost(){
		return cost;
	}
	public void setCost(int new_cost){
		cost = new_cost;
	}
	int getCup(){
		return cup;
	}
	public void setCup(int amountOfCups){
		cup = amountOfCups;
	}



}