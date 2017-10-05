class Resort{
	private int temp;

	public Resort(int temperature){
		temp = temperature;
	}

	public String determineActivity(){
		if((temp >= 80) && (temp < 95)){
			return "Go swimming!";
		} else if((60 <= temp) && (temp < 80)){
			return "Play some tennis!";
		} else if((40 <= temp) && (temp < 60)){
			return "Play some golf!";
		} else if((20 <= temp) && (temp < 40)){
			return "Go skiing!";
		} else {
			return "Visit our shops!";
		}
	}	
}