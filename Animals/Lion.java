public class Lion {
	
	
	int numberOfLegs = 4;
	int speed = 20; 
	String sound = "roar"; 
	double weight = 600; 
	String units;
	
	public Lion(int l, int s, String r, double w, String u){
		numberOfLegs = l;
		speed = s;
		sound = r;
		weight = w;
		units = u;
	}

	public Lion() {
        this(4, 20, "roar", 200,  "pounds");
    }

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


	
	public String toString(){
		return "Boom lion";
	}
}