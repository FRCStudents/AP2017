class silverMedal{ /*this line needs changing with medal color*/
	
	String Time = "3:46.24 minutes";  /*this line needs changing with medal color*/
	String Owner = "Joey Rossi";      /*this line needs changing with medal color*/


//This is the best time for the silver medal in this pool
	String getTime(){
		return Time;
	}
	
	void setTime(String NewTime){
		Time = NewTime;
	}

//This sets the owner of the best time for silver medal 
	String getOwner(){
		return Owner;
	}

	void setOwner(String NewOwner){
		Owner = NewOwner;
	}

//String to String
	
	public String toString(){
			System.out.println("Past results: ");
		return (Owner + " has the Silver Medal in this pool at " + Time); /*this line needs changing with medal color*/
		}	
		
}