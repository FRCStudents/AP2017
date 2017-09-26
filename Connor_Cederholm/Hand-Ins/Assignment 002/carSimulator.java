class carSimulator {

	int wheels = 4; 
	String drive = "2";
	int current_Speed;
	String current_direction = "n";
	String getcurrent_direction(){
		return current_direction;
	}
	
	int getcurrent_Speed(){
		return current_Speed;
	}
	void setcurrentdirection(String nowDirection){
		current_direction = nowDirection;
	}
	void setcurrent_Speed(int nowSpeed){
		current_Speed = nowSpeed;
	}
	public String toString(){
		return "AAAYYYYY";
	}
}