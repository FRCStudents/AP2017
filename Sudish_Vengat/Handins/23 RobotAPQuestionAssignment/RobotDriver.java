public class RobotDriver {
	
	public static void main(String[] args){
		Robot r = new Robot();

		System.out.println("Part A"); //returns true if there is a wall in front of it
		r.forwardMoveBlocked();

		System.out.println("Part B"); //removes an object or toy if it is on the tile
		r.move();

		System.out.println("Part C"); //returns the number of moves it takes to clear the hall
		System.out.println(r.clearHall());
	}
}