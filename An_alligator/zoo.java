public class zoo{
	int numberOfLegs;
	int weight;
	int speed;
	String sound;
	String unit;


	zoo(){
		int numberOfLegs=0;
		int weight=0;
		int speed=0;
		String sound="none";
		String unit="kg";
	}
	public void setWeight(int x){
		weight=x;
	}

	public void setSpeed(int x){
		speed=x;
	}

	public void setSound(String x){
		sound=x;
	}

	public void setUnit(String x){
		unit=x;
	}

	public int getWeight(){
		return weight;
	}

	public int getSpeed(){
		return speed;
	}

	public String getSound(){
		return sound;
	}

	public String getUnit(){
		return unit;
	}
}