public class Car {
		int wheels = 4;
		String drive = "2";
		int current_speed = 30;
		//"n" "s" "e" "w"//;
		String current_direction = "n";
		
		
		String getCurrentDirection(){
			return current_direction;
		}
		
		void setCurrentDirection(String newDirection){
			current_direction = newDirection;
		}
		
		
		int getCurrentSpeed(){
			return current_speed;
		}
		
		void setCurrentSpeed(int newSpeed){
			current_speed = newSpeed;
			
		}
		
public 	String toString(){
			return "Archit doesn't get it";
		}
}