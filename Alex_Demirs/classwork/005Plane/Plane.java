public class Plane{
	
	private String brand;
	private int wingspan;
	private int weight;

	public int getWingspan(){
		return wingspan;
	}	

	public void setWingspan(int newWingspan){
		wingspan = newWingspan;
	}


	public int getWeight(){
		return weight;
	}

	public void setWeight(int newWeight){
		weight = newWeight;
	} 

	public String getBrand(){
		return brand;
	}

	public void setBrand(String newBrand){
		brand = newBrand;
	}

	public String toString(){
		return "plane";
	}
}