public class Resort{
		
		int temp;

		int gettemp(){
			return temp;
		}
		void settemp(int New_temp){
			temp = New_temp;
		}

		String activity(){
			if (temp >= 80){
				return "Go Swimming";
			}
			else if ((60 <= temp) && (temp < 80)){
				return "Do Tennis";
			}
			else if ((40 <= temp) && (temp < 60)){
				return "Go Golf";
			}
			else if (temp < 40){
				return "Go Skiing";
			}
			return "";
		}

		String TestingFor(){
			for (int i = 0;i < 10; i++);
				return ("Stay Inside");
			}
		
}
