class Car {

	int wheels = 4;
	String drive = "2";
	int doors = 4;
	int windows = 4;
	int brakes;
	int transmission;
	int current_speed; 
	String current_direction = "N";
	
	String getcurrent_direction() {
		return current_direction;
	}
	

	int getcurrent_speed() {
		return current_speed;
	} 

	void setCurrentDirection(String newDirection){
		current_direction = newDirection;
	}

	void setCurrentSpeed(int newSpeed){
		current_speed = newSpeed;
	}



}