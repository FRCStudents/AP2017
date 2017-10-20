

public class Resort{
	int temp;

	int getTemp(){
		return temp;
	}

	void setTemp(int x){
		temp=x;
	}

	boolean swimming(){
		return temp >= 80;
	}

	boolean tennis(){
		return 60 <= temp && temp <= 79;
	}

	boolean golf(){
		return 40 <= temp && temp <= 59;
	}

	boolean skiing(){
		return temp < 40;
	}
}