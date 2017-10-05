public class Resort{

private int temp;

public int getTemp(){
		return temp;
	}

public void setTemp(int newTemp){
	temp = newTemp;
}




public String temp(){

	if(((temp > 95) || (temp < 20)) && (temp >= 80)){
		return "Visit our Shops  " + "Say yes to Swimming";
	}

	if((temp > 95) || (temp < 20)){
		return "Visit our Shops";
	}

	if(temp >= 80){
		return "Say yes to Swimming";
	}

	if((temp >= 60) && (temp < 80)){
		return "Time for Tennis";
	}

	if((temp >= 40) && (temp < 60)){
		return "Go for Golf";
	}

	if(temp < 40){
		return "Suprise for Skiing";
	}

	
	return "Yada";

}


}