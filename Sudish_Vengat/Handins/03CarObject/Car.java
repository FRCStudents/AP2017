public class Car {
		int wheeels = 4;
		String drive = "2";
		int current_speed = 30;
		//"n", "e", "s", "w"
		String current_direction = "n";
		String getCurrent_Direction () {
				return current_direction;
		}
		void setCurrentDirection(String newDirection) {
			current_direction = newDirection;
		}
		int getCurrent_Speed () {
				return current_speed;
		}
		void setCurrentSpeed(int newSpeed) {
			current_speed = newSpeed;
		}
}