public class OrcaWhale {

	private int numOfLegs = 0; 
	private int weight = 125000; //In lbs
	private int speed = 13; //Meters/sec
	private String sound = "ouuahhh";
	private String unit = "lbs";
	
	public int getNumOfLegs(){
		return numOfLegs;
	}

	public void setNumOfLegs(int new_numOfLegs){
		numOfLegs = new_numOfLegs;
	}

	public int getWeight(){
		return weight;
	}

	public void setWeight(int new_weight){
		weight = new_weight;
	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int new_speed){
		speed = new_speed;
	}

	public String getSound(){
		return sound;
	}

	public void getSound(String new_sound){
		sound = new_sound;
	}

	public String getUnit(){
		return unit;
	}

	public void setUnit(String new_unit){
		unit = new_unit;
	}

}