public class Resort{
	int temp;

	public getTemp(){
		return temp;
	}
	public void setTemp(int newTemp){
		temp = newTemp;
	}
	public void suggestActivity(){
		if(temp > 95 || temp < 20){
			System.out.println("Visit our shops!");
		}else if(temp >= 80){
			System.out.println("You should go swimming!");
		}else if(temp >= 60 && temp < 80){
			System.out.println("You should play Tennis!");
		}else if(temp >= 40 && temp < 60){
			System.out.println("You should play golf!");
		}else if(temp < 40){
			System.out.println("You should go skiing!");
		}else{
			return "Go do something!";
		}
	}
}
