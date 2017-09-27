class Resort {

	// Attributes
	private int temp;

	Resort() {
		temp = 65;
	}

	Resort(int a) {
		temp = a;
	}

	// Methods
	public int getTemp() {
		return temp;
	}
	public String returnActivity() {
		if ((temp > 95) || (temp < 20)) {
			return "Visit our shops!";
		}
		if ((temp >= 80) && (temp <= 95)) {
			return "swimming";
		}
		if ((60 <= temp) && (temp < 80)) {
			return "tennis";
		}
		if ((40 <= temp) && (temp < 60)) {
			return "golf";
		}
		if ((temp < 40) && (temp >= 20)) {
			return "skiing";
		}
		return "";
	}
}