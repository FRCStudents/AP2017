
public class APComputerNERD implements comparable{
	
	public int intelligence; 
	public int speed; 
	public int laptopPerformance; 
	public String fName;
	public boolean thing;

	public APComputerNERD(){ this("Kevin", 8, 2, 7); }

	public APComputerNERD(String a, int b, int c, int d){
		setIntelligence(b);
		setSpeed(c);
		setLaptopPerformance(d);
		fName = a;
		thing = true;
	}

	public void setSortTypeName(){ thing = true;	}

	public void setSortTypeIntelligence(){ thing = false; }

	public int getIntelligence(){ return intelligence; }
	
	public void setIntelligence(int b){ intelligence = b; }

	public int getSpeed(){ return speed; }
	
	public void setSpeed(int c){ speed = c; }

	public int getLaptopPerformance(){ return laptopPerformance; }

	public void setLaptopPerformance(int d){ laptopPerformance = d;	}
	
	public void setName(String a){ fName = a; }
	
	public String getName(){ return fName; }
	

	
	public int compareTo(Object NARD){
		APComputerNERD arrayOfNERDZ = (APComputerNERD)NARD;

		String thisName = this.getName();
		String driverzName = arrayOfNERDZ.getName();

		int thisIntele = this.getIntelligence();
		int driverzIntele = arrayOfNERDZ.getIntelligence();



		if(thisIntele == driverzIntele && !thing){
			return 0;
		}

		if(thisName.equals(driverzName) && thing){
			return 0;
		}

		if(thing){
			return compareNames(thisName, driverzName);
		}
		return compareIntelegence(thisIntele, driverzIntele);
	}

	public int compareNames(String thisName, String driverzName){
    	for(int i=0; (i < thisName.length() && i < driverzName.length()); i++){
        	if (thisName.charAt(i) > driverzName.charAt(i)) { return 1; } 
			} return -1;
		}

	public int compareIntelegence(int thisIntele, int driverzIntele){
		if (thisIntele > driverzIntele){
			return 1; } else {  return -1; }
	}

	public void displayNerd(){

		System.out.println("[Name: " + getName() + " | Intellegence: " + getIntelligence() + " | Speed: " + getSpeed() + " | Laptop Performance: " + getLaptopPerformance() + "]");
	}	
	
	public void displayKevin(){
		System.out.println("\n\nAttributes for " + fName);
		System.out.println("[Name: " + fName + " | Intellegence: " + intelligence + " | Speed: " + speed + " | Laptop Performance: " + laptopPerformance + "]");
	}
}
