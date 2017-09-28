class Resort{
	
	int temp;

//getter
		
	int getTemp(){
		return temp;
	}
//setter
	void setTemp(int newTemp){
		temp = newTemp;
	}

//Determining the Activity
	
	String determineActivity(){
			
		//swimming
		if ((temp >= 80) && (temp <= 95)){
			return "Go Swimming!";
			}
		
		//Tennis
		if ((temp >= 60) && (temp <= 80)){
			return "Go Play Tennis!";
			}
		//Golf
		if ((temp >= 40) && (temp <= 60)){
			return "Go Swimming!";
			}
		
		//Skiing
		if ((temp >= 20) && (temp <= 40)){
			return "Go Skiing!";
			}

		//Shopping
		if ((temp > 95) || (temp < 20)){
			return "Visit Our Shops!";
		}
		else return "Sorry, Due to Temperature Issues we are not open";
	}

	/*String toString;
	public String toString(){
	return "Go Golfing!";
	}
*/
}
