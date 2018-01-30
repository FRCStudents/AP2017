class Weekdays{
	String[] days = {
	"Sunday",
	"Monday",
	"Tuesday",
	"Wednesday",
	"Thursday",
	"Friday",
	"Saturday"	
	} ;
	public void weekdaysForward(){
		for (int i = 0; i < days.length; i++ )
			System.out.println(days[i]);

	}
	public void weekdaysBackward(){
		for (int j = 6; j > -1; j--)
			System.out.println(days[j]);
	}
}