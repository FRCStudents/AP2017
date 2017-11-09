public class MoreForLoops{

		private String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		public void getDaysOfWeek(){
		for (int i = 0; i < 7; i++){
			System.out.println(daysOfWeek[i]); 
		}

		System.out.println("");

		}


		public void getDaysOfWeekBackwards(){
		for (int i = 6; i >= 0; i--){
			System.out.println(daysOfWeek[i]);
		
		}

		System.out.println("");

		}
}