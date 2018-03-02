public class RobotDriver{
	public static void main(String [] argv){
		Robot a = new Robot();
		a.setHall(0, 2);
		a.setHall(1, 3);
		a.setHall(2, 1);

		System.out.println(a.clearHall());
	}
}