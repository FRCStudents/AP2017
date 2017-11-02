class Drink {


	// Attributes
	String name;
	double price;
	int inventory;


	Drink(String name, double price, int inventory) {
		setName(name);
		setPrice(price);
		setInventory(inventory);
	}

	Drink() {
		this("Coca-Cola", 2.50, 5);
	}

	
	// Methods
	public String getName() {
		return name;
	}
	public void setName(String new_name) {
		name = new_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double new_price) {
		price = new_price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int new_inv) {
		inventory = new_inv;
	}

}