class bronzeMedal{ /*this line needs changing with medal color*/
	
	String Time = "4:00.43 minutes";  /*this line needs changing with medal color*/
	String Owner = "Tina Underwood";      /*this line needs changing with medal color*/


//This is the best time for the bronze medal in this pool
	String getTime(){
		return Time;
	}
	
	void setTime(String NewTime){
		Time = NewTime;
	}

//This sets the owner of the best time for bronze medal 
	String getOwner(){
		return Owner;
	}

	void setOwner(String NewOwner){
		Owner = NewOwner;
	}

//String to String
	
	public String toString(){
			System.out.println("Past results: ");
		return (Owner + " has the Bronze Medal in this pool at " + Time); /*this line needs changing with medal color*/
		}	
		
}