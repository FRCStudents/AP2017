public class Resort {

	int temp = 80; 

	public Resort(int newtemp) {
		this.temp = newtemp;
	}

	public String getActivity() {
		String activity = "unsure what to";
		if (temp >= 80) {
			activity = "swimming";
		} else if (temp >= 60 && temp < 80) {
			activity = "tennis";
		} else if (temp >= 40 && temp < 60) {
			activity = "golf";
		} else if (temp < 40) {
			activity = "skiing";
		}
		return activity;
	}

	public boolean TemperatureAbove95(String y){
		if(y.equals("true")){
			return true;
		}else{
			return false;
		}
		}
	
	public boolean TemperatureBelow20(String x){
		if(x.equals("true")){
			return true;
		}else{
			return false;
		}
	}}
	
	