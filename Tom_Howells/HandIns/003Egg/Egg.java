class Egg{
	private boolean fertilized;
	private String color;

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

	public String startToString(){
		if(fertilized){
			return "i am a fertilized, ";
		} else {
			return "i am an unfertilized, ";
		}
	}

	public String toString(){
		return startToString() + color + " egg.";
	}
}