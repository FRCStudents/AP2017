class Egg{
	private boolean fertilized;
	private String color;
	private String foo;

	public boolean getFertilized(){
		return fertilized;
	}
	public void setFertilized(boolean status){
		fertilized = status;
	}

	public String getColor(){
		return color;
	}
	public void setColor(String newColor){
		color = newColor;
	}

	public String toString(){
		if(fertilized){
			foo = "i am a fertilized, ";
		} else {
			foo = "i am an unfertilized, ";
		}
		foo += color;
		foo += " egg.";
		return foo;
	}
}