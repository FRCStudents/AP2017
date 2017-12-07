public class vehicle{
	int wheels;
	int engine;
	int year;
	String maker = null;
	String model = null;
	String type = null;
	String drivetrain = null;
	String trim = null;

	vehicle(){
		setWheels(4);
		setEngine(4);
		setType("hatchback");
		setDrivetrain("fwd");
		setTrim("standard");
	}

	vehicle(int a, int b, String c, String d, String e, String f, String g){
		setWheels(4);
		setEngine(a);
		setYear(b);
		setMaker(c);
		setModel(d);
		setType(e);
		setDrivetrain(f);
		setTrim(g);
	}

	vehicle(int a, int b, int c, String d, String e, String f, String g, String h){
		setWheels(a);
		setEngine(b);
		setYear(c);
		setMaker(d);
		setModel(e);
		setType(f);
		setDrivetrain(g);
		setTrim(h);
	}

	int getWheels(){
		return wheels;
	}

	int getEngine(){
		return engine;		
	}

	int getYear(){
		return year;		
	}

	String getMaker(){
		return maker;
	}

	String getType(){
		return type;
	}

	String getDrivetrain(){
		return drivetrain;
	}

	String getTrim(){
		return trim;
	}

	void setWheels(int a){
		wheels = a;
	}

	void setEngine(int a){
		engine = a;		
	}

	void setYear(int a){
		year = a;	
	}

	void setMaker(String a){
		maker = a;
	}
	void setModel(String a){
		model = a;
	}

	void setType(String a){
		type = a;
	}

	void setDrivetrain(String a){
		drivetrain = a;
	}

	void setTrim(String a){
		trim = a;
	}
}