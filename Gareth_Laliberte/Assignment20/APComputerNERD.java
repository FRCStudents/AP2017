	
	//SPECS:
	// Attribures: Intelligence, Speed, Performance, Name
	//Must inplement "Comparable" interface
	//Must implement toCompare() from interface
	//----Driver---
	//Driver implements array of APComputerNerd objects
	//Driver prints array
	//Driver sorts array using toCompare()
	//Optional: Randomize Array


public class APComputerNERD implements Comparable{

	public int intelligence; //between 9 and 10
	public int speed; //between 4 and 18
	public int laptopPerformance; //between 0 and 10
	public String firstName;

	int[] arr = new int[5];

	APComputerNERD(int i, int s, int p, String f){
		intelligence = i;
		speed = s;
		laptopPerformance = p;
		firstName = f;
	}

	APComputerNERD(){
		this(9, 5, 9, "Gareth");
	}

	//Getters & Setters
//---------------------------------------
	public int getIntelligence(){
		return intelligence;
	}
	public void setIntelligence(int i){
		intelligence = i;
	}
//---------------------------------------
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int s){
		speed = s;
	}
//---------------------------------------
	public int getPerformance(){
		return laptopPerformance;
	}
	public void setPerformance(int p){
		laptopPerformance = p;
	}
//---------------------------------------
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String f){
		firstName = f;
	}
//---------------------------------------

public int compareTo(Object Nerd){

		APComputerNERD acn = (APComputerNERD)Nerd;
		
		if (this.getIntelligence() > acn.getIntelligence()){
			return 1;
		}
		if(this.getIntelligence() > acn.getIntelligence()){
			return 0;
		}
		return -1;
	}

}
