public class Lemur {
	
	//attributes
	int numberOfLegs = 2;
	int speed = 12; //mph
	String sound = "hmm"; 
	double weight = 4.9; //pounds
	String units;

	/*constructor
	public Lemur(int l, int s, String h, double w, String u){
		numberOfLegs = l;
		speed = s;
		sound = h;
		weight = w;
		units = u;
	} */

	//getters and setters
	public int getNumberOfLegs(){
		return numberOfLegs;
	}

	public void setNumberOfLegs(int newNumberOfLegs){
		numberOfLegs = newNumberOfLegs;
	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}

	public String getSound(){
		return sound;
	}

	public void setSound(String newSound){
		sound = newSound;
	}

	public double getWeight(){
		return weight;
	}

	public void setWeight(double newWeight){
		weight = newWeight;
	}

	public String getUnits(){
		return units;
	}

	public void setUnits(String newUnits){
		units = newUnits;
	}


	//String toSTring
	public String toString(){
		return "This is a Lemur";
	}
}