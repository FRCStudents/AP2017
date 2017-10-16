public class Resort {

private	int temp;

public int getTemp() {
	return temp;
}
public void setTemp(int newTemp) {
	temp = newTemp;
}

public String determineActivity() {

	if(temp >= 80) {
		return "Go swimming";
	} else if((temp > 95) || (temp < 20)) {
		return "Visit our Shops";
	} else if((60 <= temp) && (temp < 80)) {
		return "Play tennis";
	} else if((40 <= temp) && (temp < 60)) {
		return "Play golf";
	} else if((20 <= temp) && (temp < 40)) {
		return "Go skiing";
	} else {
		return "Visit our shops";
	}
}
}
