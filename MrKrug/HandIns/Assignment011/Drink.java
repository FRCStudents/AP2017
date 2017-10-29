
class Drink {
	private String name;
	/* price is in pennies */
	private int price;

	public Drink(String n, int p){
		name = n;
		price = p;
	}

	public Drink(){
		this("Coke", 125);
	}

	public int getPrice(){
		return price;
	}

	public String getName(){
		return name;
	}
}
