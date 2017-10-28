
class Drink {
	private String name;
	private double price;

	public Drink(String n, double p){
		name = n;
		price = p;
	}

	public Drink(){
		this("Coke", 1.25);
	}

	public double getPrice(){
		return price;
	}

	public String getName(){
		return name;
	}
}
