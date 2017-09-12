class Car {
	int currentSpeed;
	int wheels;
	int windows;
	int doors;
	boolean engineStatus = false;
	String transmition;
	int cylinders = 4;
	//"N" "S" "E" "W"
	String currentDirection = "N";

	public void turnLeft(String newDirection) {
		if(currentDirection.equals("N")) {
			currentDirection = "W";
		}
		else if(currentDirection.equals("W")) {
			currentDirection = "S";
		}
		else if(currentDirection.equals("S")) {
			currentDirection = "E";
		}
		else if(currentDirection.equals("E")) {
			currentDirection = "N";
		}
		else {
			System.out.println("ERROR!");
		}
	}
	public void printDirrection() {
		System.out.println("You are currently headed " + currentDirection);
	}
	public String getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(String newDirection) {
		currentDirection = newDirection;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int newSpeed) {
		currentSpeed = newSpeed;
	}

	public String toString() {
		return "This car has an engine with " + cylinders + ". \n ~~~~~~~~~~~~~~~~~~~~~~~~~~ \n Welcome to our Car Simulator! \n";
	}
}