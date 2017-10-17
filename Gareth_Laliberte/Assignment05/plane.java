class Plane {
	int Wingspan;
	int Weight;
	String Brand;
	
	int getWingspan(){
		return Wingspan;
	}

	void setWingspan(int newWingspan) {
		Wingspan = newWingspan;
	}

	int getWeight(){
		return Weight;
	}

	void setWeight(int newWeight) {
		Weight = newWeight;
	}

	String getBrand() {
		return Brand;
	}

	void setBrand(String newBrand) {
		Brand = newBrand;
	}

	Plane plane = new Plane();
	Plane() {
	Brand = "Boig";
	}

	Plane (String newBrand) {
		Brand = newBrand;
	}
	//the problem with his code was the fact that it called 'brand' twice

	public String toString() {
		return "ZOOOOOOOOOOM";
	}
}