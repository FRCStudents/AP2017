//SPECS:
   // Attribures: Intelligence, Speed, Performance, Name
   //Must inplement "Comparable" interface
   //Must implement toCompare() from interface
   //----Driver---
   //Driver implements array of APComputerNerd objects
   //Driver prints array
   //Driver sorts array using toCompare() for name and intelegence

public class APCN implements comparable{
	
	public int intelligence; //ranges from 1 to 10 for excitement on the sort
	public int speed; //ranges from 0-5
	public int laptopPerformance; //ranges from 1 to 20
	public String fName;
	public boolean flagger;

	public APCN(){ this("Kevin", 8, 2, 7); }

	public APCN(String a, int b, int c, int d){
		setIntelligence(b);
		setSpeed(c);
		setLaptopPerformance(d);
		fName = a;
		flagger = true;
	}
/*
	public APCN(APCN arrayOfNERDZ){
		setIntelligence(arrayOfNERDZ.getIntelligence());
		setSpeed(arrayOfNERDZ.getSpeed());
		setLaptopPerformance(arrayOfNERDZ.getLaptopPerformance());
		setName(arrayOfNERDZ.getName());
	}
*/
//-------------------------------GETTERS & SETTERS-------------------------:
	public void setSortTypeName(){ flagger = true;	}

	public void setSortTypeIntelligence(){ flagger = false; }
//--------
	public int getIntelligence(){ return intelligence; }
	
	public void setIntelligence(int b){ intelligence = b; }
//---------
	public int getSpeed(){ return speed; }
	
	public void setSpeed(int c){ speed = c; }
//-------
	public int getLaptopPerformance(){ return laptopPerformance; }

	public void setLaptopPerformance(int d){ laptopPerformance = d;	}
//------	
	public void setName(String a){ fName = a; }
	
	public String getName(){ return fName; }
	
//-------------------end of getters and setters ----------------------------------
	//BEGIN COMPARE TO SECTION;::
	
	public int compareTo(Object NARD){
		APCN arrayOfNERDZ = (APCN)NARD;

		//for comparing names::
		String thisName = this.getName();
		String driverzName = arrayOfNERDZ.getName();
		
		//for comparing intelegence::
		int thisIntele = this.getIntelligence();
		int driverzIntele = arrayOfNERDZ.getIntelligence();


		//if they equal eachother, return 0
		if(thisIntele == driverzIntele && !flagger){
			return 0;
		}

		if(thisName.equals(driverzName) && flagger){
			return 0;
		}

		if(flagger){
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
//-----------------------------------------------------------------------------
	public void displayNerd(){
		//System.out.println();
		System.out.println("[Name: " + getName() + " | Intellegence: " + getIntelligence() + " | Speed: " + getSpeed() + " | Laptop Performance: " + getLaptopPerformance() + "]");
	}	
	
	public void displayKevin(){
		System.out.println("\n\nAttributes for " + fName);
		System.out.println("[Name: " + fName + " | Intellegence: " + intelligence + " | Speed: " + speed + " | Laptop Performance: " + laptopPerformance + "]");
	}
}
