public class Week{
	String[] week = {"Sunday","Monday","Tuesday","Wensday","Thursday","Friday","Saturday"};

	public void getweek(){
		System.out.println("str");
		int y=1;
		for(int x=0; x>=0; x+=y){
			if(x>6){
				x=x-1;
				y=-1;
			}
			System.out.println(week[x]);
		}
	}
}