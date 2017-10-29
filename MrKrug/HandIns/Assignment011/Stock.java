class Stock {
	private Drink drink;
	private int remaining;

	public Stock (Drink d, int r){
		drink = d;
		remaining = r;
	}

	public void addDrink(){
		remaining++;
	}

	public boolean drinkInStock(){
			if(remaining > 0) return true;
			return false;
	}

	public Drink getDrink(){
		return drink;
	}

	public void diminish(){
		if(remaining < 1){
			System.out.println("Sorry, there are no more " + drink.getName());
		}
		else {
			remaining--;
		}
	}

	public boolean sameDrink(Drink d){
		if(d.getName().equals(drink.getName())){
			return true;
		}
		return false;
	}

	public boolean useDrink(){
		if(remaining < 1){
			return false;
		}
		remaining--;
		return true;
	}

	private String formatPrice(int a){
			int d;
			int p;

			p = a % 100;
			d = a/100;
			if(d > 0){
				return "" + d + "." + p;
			}
			return "." + p;
	}

	public void showStock(int n){
		System.out.println(n + ") " + remaining +
											" Drinks: " +
											drink.getName() +
											" (" + formatPrice(drink.getPrice()) + ")");
	}

}
