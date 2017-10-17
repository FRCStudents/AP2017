class Car{
	//public static void main(String[] args);
		int wheels = 4;
		String drive = "2";
		int current_speed = 30;
		String current_direction = "North";

		String getCurrentDirection() {
			return current_direction;
		}

		void setCurrentDirection(String new_direction){
			current_direction = new_direction;
		}	

		int getCurrentSpeed(){
			return current_speed;
		}

		void setCurrentSpeed(int new_speed){
			current_speed = new_speed;
		}

		public String toString(){
			return "Vroom Vroom!!";
		}
}