public class Egg {
	boolean fertilized;
	String color;
	String current_color = "blue";
	String getCurrent_Color () {
			return current_color;
	}
	void setCurrentColor(String newColor) {
		current_color = newColor;
		}
	String current_fertilization;
	String getCurrent_Fertilization () {
			return current_fertilization;
	}
	void setCurrentFertilization(String newFertilization) {
		current_fertilization = newFertilization;
	}
}