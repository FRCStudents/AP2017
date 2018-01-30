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
				return "Swimming";
			}
			else if ((60 <= temp) && (temp < 80)){
				return "Tennis";
			}
			else if ((40 <= temp) && (temp < 60)){
				return "Golf";
			}
			else if (temp < 40){
				return "Skiing";
			}
			return "";
		}

		String TestingFor(){
			for (int i = 0;i < 10; i++);
				return ("Connor Is GAYYYY");
			}

		
}
