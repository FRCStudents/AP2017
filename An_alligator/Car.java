import java.util.Scanner; 

public class Car{
        boolean engine_Status;
    	int cyl;
	double hp;
	double ft_lbs;
	int max_rpm;
	String drive;
	int current_Speed;

	public String toString(){
		return "yo BB";
	}

	public String getDrive(){
		return drive;
	}

	public void setDrive(String newDrive){
		drive = newDrive;
	}	

	public void defaults() {
		engine_Status=false;
		cyl=4;
		hp=50;
		ft_lbs=52.5;
		max_rpm=5000;
		drive="ff";
	}
}