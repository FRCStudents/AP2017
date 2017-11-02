class Weekdays{
	String []  days = {
		"Sunday", //0 place in index
		"Monday", //1
		"Tuesday", //2
		"Wednesday", //3
		"Thursday", //4
		"Friday", //5
		"Saturday" //6
	};

	public void moveForward(){
		for(int i = 0; i < 6; i++)
			System.out.println(days[i]);
	}
	public void moveBackward(){
		for(int i = 6; i > -1; i--)
			System.out.println(days[i]);
	}
}