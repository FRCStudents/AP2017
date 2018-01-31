public class APComputerNerd implements Comparable{

	//Atrributes
	private int intelligence; //{9,10}
	private int speed; //{4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}
	private int laptopPerformance; //{0,1,2,3,4,5,6,7,8,9,10}
	private String firstName;


	public APComputerNerd(int i, int s, int l, String f){
		intelligence = i;
		speed = s;
		laptopPerformance = l;
		firstName = f;
		this("Ralph", 8, 3, 2);
	}


	//Getters and Setters
	public int getSeed(){
		return speed;
	}


	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}

	public int getIntelligence(){
		return intelligence;
	}

	public void setIntelligence(int newIntelligence){
		intelligence = newIntelligence;
	}

	public int getLaptopPerformance(){
		return laptopPerformance;
	}

	public void setLaptopPerformance(int newLaptopPerformance){
		laptopPerformance = newLaptopPerformance;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}


	//Compares object 
	public int compareTo(APComputerNerd nerd1, boolean nerd2){ 
		if (nerd2) {
            if (nerd1.getIntelligence() > intelligence) {
                return -1;
            } else if (nerd1.getIntelligence() < intelligence) {
                return 1;
            } else {
                return 0;
            }

        } else {
            if (nerd1.getFirstName().charAt(0) > firstName.charAt(0)) {
                return -1;
            } else if (nerd1.getFirstName().charAt(0) < firstName.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
