public class Plane {

private	String brand;
private	int weight = 2000;
private	int wingspan;


	
	public Plane() {
		brand = "Ethihad Airway's";
	}
	public Plane(String newBrand) {
		brand = newBrand;
	}
	public int getWingspan() {
		return wingspan;
	}
	public void setWingspan(int new_wingspan) {
		wingspan = new_wingspan;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int new_weight) {
		weight = new_weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String new_brand) {
		brand = new_brand;
	}
	public String toString() {
		return "plane is currently flying";
	}
}