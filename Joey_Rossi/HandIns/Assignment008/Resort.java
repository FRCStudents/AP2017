class Resort{
	
	int temp;

	int getTemp(){
		return temp;
	}
	void setTemp(int newTemp){
		temp = newTemp;
	}
	String activities(){
		if(temp >= 80){
			return "swimming";
		}
		else if(60 <= temp && temp < 80){
			return "tennis";
		}
		else if(40 <= temp && temp < 60){
			return "golf";
		}
		else if(temp < 40){
			return "skiing";
		}
		else if(temp > 95 || temp < 20){
			return "Visit our shops!";
		}
		else {
			return "ERROR!";
		}
	}	

	

	public static void main(String[] args){
		Resort Day1 = new Resort();

		Day1.setTemp(35);

		System.out.println(Day1.activities());


	}
}
