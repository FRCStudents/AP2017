public class APComputerNerd implements comparable{
	
	public int intelligence; 
	public int speed; 
	public int laptopPerformance; 
	public String fName;
	public boolean flagger;

	public APComputerNerd(){ this("Michael Scott", 10, 10, 20); }
	// why do I need this?

	public APComputerNerd(String a, int i, int s, int l){
		setIntelligence(i);
		setSpeed(s);
		setLaptopPerformance(l);
		fName = a;
		flagger = true;
	}

	public void setSortTypeName(){ flagger = true;	}

	public void setSortTypeIntelligence(){ flagger = false; }

	public int getIntelligence(){ return intelligence; }
	
	public void setIntelligence(int i){ intelligence = i; }

	public int getSpeed(){ return speed; }
	
	public void setSpeed(int s){ speed = s; }

	public int getLaptopPerformance(){ return laptopPerformance; }

	public void setLaptopPerformance(int l){ laptopPerformance = l;	}
	
	public void setName(String a){ fName = a; }
	
	public String getName(){ return fName; }
	
	
	public int compareTo(Object NERD){
		APComputerNerd arrayNerds = (APComputerNerd)NERD;

		String thisName = this.getName();
		String person = arrayNerds.getName();
		
		int thisIntelligence = this.getIntelligence();
		int personsIntelligence = arrayNerds.getIntelligence();


		//if they equal eachother, return 0
		if(thisIntelligence == personsIntelligence && !flagger){
			return 0;
		}

		if(thisName.equals(person) && flagger){
			return 0;
		}

		if(flagger){
			return compareNames(thisName, person);
		}
		return compareIntelegence(thisIntelligence, personsIntelligence);
	}

	public int compareNames(String thisName, String person){
    	for(int i=0; (i < thisName.length() && i < person.length()); i++){
        	if (thisName.charAt(i) > person.charAt(i)) { return 1; } 
			} return -1;
		}

	public int compareIntelegence(int thisIntelligence, int personsIntelligence){
		if (thisIntelligence > personsIntelligence){
			return 1; } else {  return -1; }
	}

	public void displayNerd(){
		//System.out.println();
		System.out.println("[Name: " + getName() + " | Intellegence: " + getIntelligence() + " | Speed: " + getSpeed() + " | Laptop Performance: " + getLaptopPerformance() + "]");
	}	
	
	public void displayNerd2(){
		System.out.println("[Name: " + getName() + " | Intellegence: " + getIntelligence() + "]");
	}
	
	public void displayKevin(){
		System.out.println("Attributes for " + fName);
		System.out.println("[Name: " + fName + " | Intellegence: " + intelligence + " | Speed: " + speed + " | Laptop Performance: " + laptopPerformance + "]");
	}
}