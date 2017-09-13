class Car{
	private int wheels = 4;
	private String drive = "2";
	private int current_speed = 30;
	// 'n', 'e', 's', 'w'
	private String current_direction = "n";



	public String getCurrentDirection(){
		return current_direction;
	}
	public void setCurrentDirection(String new_direction){
		current_direction = new_direction;
	}
	public int getCurrentSpeed(){
		return current_speed;
	}
	public void setCurrentSpeed(int new_speed){
		current_speed = new_speed;
	}

	public String toString(){
		return "vroom vroom";
	}
}