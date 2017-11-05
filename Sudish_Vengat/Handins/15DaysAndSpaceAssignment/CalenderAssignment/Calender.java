public class Calender{

	String[] DAYS_OF_THE_WEEK = {

	"Sunday", 
	"Monday",
	"Tuesday", 
	"Wednesday", 
	"Thursday", 
	"Friday", 
	"Saturday" 
	};

	public void days(){
		for(int i=0; i<7; i++){
		System.out.println(DAYS_OF_THE_WEEK[i]);
		}
	}

	public void reverseDays(){
		for(int b=6; b>0; b--){
			System.out.println(DAYS_OF_THE_WEEK[b]);
		}
	}

}