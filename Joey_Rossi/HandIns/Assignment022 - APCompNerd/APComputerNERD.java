class APComputerNERD implements Comparable{
	//attributes
	private int intelligence; // 9-10;
	private int speed; // 4-18;
	private int laptopPerformance; // 0-10;
	private String firstName; //"Bonnor"
	private boolean sortType; //if true, sort by name

	public APComputerNERD() {
		this(9, 10, 8, "Bonnor");
	}

	//constructor 	
	public APComputerNERD(int i, int s, int lp, String fn) {
        intelligence = i;
        speed = s;
        laptopPerformance = lp;
        firstName = fn;
        sortType = true;
    }
    public APComputerNERD(APComputerNERD apcn){
    	setFirstName(acpn.getFirstName());
    	setIntelligence(acpn.getIntelligence()); 
    	setSpeed(acpn.getSpeed());
    	setLaptopPerformance(acpn.getLaptopPerformance());
    }

		//getters and setters
	public int getIntelligence(){
		return intelligence;
	}
	public int getSpeed(){
		return speed;
	}
	public int getLaptopPerformance(){
		return laptopPerformance;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setIntelligence(int i){
		intelligence = i;
	}
	public void setSpeed(int s){
		speed = s;
	}
	public void setLaptopPerformance(int lp){
		laptopPerformance = lp;
	}
	public void setFirstName(String fn){
		firstName = fn;
	}
	//compareTo
	public int compareTo(APComputerNERD nerd, boolean choice) {
        if (choice) {
            if (nerd.getIntelligence() > intelligence) {
                return -1;
            } else if (nerd.getIntelligence() < intelligence) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (nerd.getFirstName().charAt(0) > firstName.charAt(0)) {
                return -1;
            } else if (nerd.getFirstName().charAt(0) < firstName.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

	public String toString() {
        return (firstName + "(" + intelligence + "," + speed + "," + laptopPerformance + ")");
    }
}
