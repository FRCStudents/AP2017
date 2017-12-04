public class Capybara{
	private int numberOfLegs;
	private int weight; //pounds
	private int speed;
	private String sound;

	private Capybara(){
		numberOfLegs = 4;
		weight =  108;
		speed = 9;
		sound = "Bririririririri";
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

	public String getSound(){
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

	public void setSound(String n){
		sound = n;
	}

	public String toString(){
		return "The Capybara says Bririririririri";
	} 
}