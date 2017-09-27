class Resort{
	
	int temperature = 45; 
	
	int getTemperature(){
		return temperature;
	}
	
	String returnAppropriteActivity(){
		
		//swimming
		if ((temperature >= 80.0) && (temperature <= 95.0)){
			return "Go Swimming!";
		}
		
		//Tennis
		if ((temperature >= 60.0) && (temperature <= 80.0)){
			return "Go Play Tennis!";
		}
		
		//Golf
		if ((temperature >= 40.0) && (temperature <= 60.0)){
			return "Go Swimming!";
		}
		
		//Skiing
		if ((temperature >= 20.0) && (temperature <= 40.0)){
			return "Go Skiing!";
		}
		
		//Shopping
		if ((temperature > 95.0) || (temperature < 20.0)){
			return "Visit Our Shops!";
		}
		else return "Sorry, Due to Temperature Issues we are not open";
	}
}