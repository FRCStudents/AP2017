public class Weeks{

	String[] dayOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	

	public void getdayOfWeek(){
		for(int i=0;i<7;i++)
		System.out.println(dayOfWeek[i]);
	

	}

	public void getdayOfWeekBackwards(){
			for (int i=6; i>=0; i--)
		System.out.println(dayOfWeek[i]);

	}
}