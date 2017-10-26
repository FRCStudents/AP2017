class goldMedal{
	
	String Time = "3:31.34 minutes";
	String Owner = "Micheal Phelps";


//This is the best time for the gold medal in this pool
	String getTime(){
		return Time;
	}
	
	void setTime(String NewTime){
		Time = NewTime;
	}

//This sets the owner of the best time for gold medal 
	String getOwner(){
		return Owner;
	}

	void setOwner(String NewOwner){
		Owner = NewOwner;
	}

//String to String
	
	public String toString(){
			System.out.println("Past results: ");
		return (Owner + " has the Gold Medal in this pool at " + Time); 
		}	
		
}