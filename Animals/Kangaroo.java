public class Kangaroo extends Animal{
	private int weight;
	private double speed;
	private String sound;
	private int numOfLegs;

	public Kangaroo(){
		int weight = 200;
		double speed = 19.6698;
		String sound = "ThruuThruuuThruuu";
		int numOfLegs = 2;
	}
	public int getWeight(){
		return weight;
	}
	public double getSpeed(){
		return speed;
	}
	public int getNumOfLegs(){
		return numOfLegs;
	}
	public void setNumOfLegs(int n){
		numOfLegs = n;
	}
	public void setSpeed(int s){
		speed = s;
	}
	public void setWeight(int w){
		weight = w;
	}
	public String toString(){
		return "VICTORYY SCREEEECH";
	}
}