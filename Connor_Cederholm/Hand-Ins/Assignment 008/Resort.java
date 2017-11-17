public class Resort{
	int temp;

	int gettemp(){
		return temp;
	}
	void settemp(int thetemp){
		temp = thetemp;
	}

	String recommend(){
		if ((temp >= 80) && (temp <= 95)){
			return "swimming";
		}else if ((60 <= temp) && (temp < 80)){
			return "tennis";
		}else if ((40 <= temp) && (temp < 60)){
			return "golf";
		}else if ((temp < 40) && (temp >= 20)){
			return "skiiing";
		}else if ((temp > 95) || (temp <20)){
			return "Visit our Shops!";
		}
		return "ERROR";
	}
	
		
}