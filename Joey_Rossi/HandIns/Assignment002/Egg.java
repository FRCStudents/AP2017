class Egg {

	boolean fertilized;
	String color;
	//if boolean = true, Egg is fertilized = Chicken
	String getcurrent_color() {
		return color;
	}
	boolean getcurrent_fertilized() {
		return fertilized;
	}
	void setCurrentColor(String newColor){
		color = newColor;
	}
	 
	void setCurrentFertilize(boolean newFertilize){
		fertilized = newFertilize;
	}
	public String toString(){
		return "Hello";
	}
}