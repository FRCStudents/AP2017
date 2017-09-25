public class Plane {

	// Attributes
	String brand;
	int weight = 2000;
	int wingspan;


	// Methods
	Plane() {
		brand = "Boeing";
	}
	Plane(String newBrand) {
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
		return "fly boi";
	}
}