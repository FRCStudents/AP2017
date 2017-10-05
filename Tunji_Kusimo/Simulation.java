import java.util.Scanner; 

public class Simulation{
	public static void main(String[] args){
		Car c= new Car();
		c.defaults();
		System.out.println("Engine status: "+c.engine_Status);
		System.out.println("Cylinders: "+c.cyl);
		System.out.println("Horsepower"+c.hp);
		System.out.println("Ft lbs: "+c.ft_lbs);
		System.out.println("Max rpm: "+c.max_rpm);
		System.out.println("Drive: "+c.drive);
		System.out.println("Current speed: "+c.current_Speed);
	}
}