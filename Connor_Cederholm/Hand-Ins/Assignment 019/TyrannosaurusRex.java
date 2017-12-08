public class TyrannosaurusRex extends Animal{
	private int numberOfLegs;
	private int weight; //pounds
	private int speed;
	private String sound;

	private TyrannosaurusRex(){
		numberOfLegs = 2;
		weight =  1800;
		speed = 5;
		sound = "Deafening Roar";
	}

	public int getNumberOfLegs(){
		return numberOfLegs;
	}

	public int getWeight(){
		return weight;
	}

	public int getSpeed(){
		return speed;
	}

	public String getSpeech(){
		return sound;
	}

	public void setNumberOfLegs(int n){
		numberOfLegs = n;
	}

	public void setWeight(int n){
		weight = n;
	}

	public void setSpeed(int n){
		speed = n;
	}

	public void setSpeech(String n){
		sound = n;
	}

	public String toString(){
		return "King of the Dinosaurs babyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
	} 
}