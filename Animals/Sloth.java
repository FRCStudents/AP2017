public class Sloth {

	private int numberOfLegs = 4;
	private double weight = 8.75; // lbs
	private double speed = 0.05; // meters per second
	private String sound = "WaAAAaa";
	private String units = "pounds"; // for weight

	public Sloth(int a, double b, double c, String d, String e) {
		setNumberOfLegs(a);
		setWeight(b);
		setSpeed(c);
		setSound(d);
		setUnits(e);
	}

	public Sloth() {
		this(4, 8.75, 0.05, "WaAAAaa", "pounds");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int x) {
		numberOfLegs = x;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double x) {
		weight = x;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double x) {
		speed = x;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String x) {
		sound = x;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String x) {
		units = x;
	}
	public String toString() {
		return "Sloth\n" + sound; 
	}

}