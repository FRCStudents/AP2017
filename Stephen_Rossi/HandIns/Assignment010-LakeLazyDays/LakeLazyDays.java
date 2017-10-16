public class LakeLazyDays {
	private int temp;

	public int getTemp(){
		return temp;
	}
	public void setTemp(int newTemp){
		temp = newTemp;
	}
	public String determineActivity() {
		if (temp > 95 || temp < 20 ){
			return "Visit our shops!";
		} else if (temp >= 80) {
			return "Lets go swimming!";
		} else if (temp < 40){
			return  "Lets go skiing!";
		} else if (temp >= 60 && temp < 80) {
			return "Lets go swimming!";
		} else if (temp >= 40 && temp < 60) {
			return "Play some golf!";
		} else {
			return "ERROR!";
		}

	}
	public static void main(String[] args) {
		LakeLazyDays activity = new LakeLazyDays();

		activity.setTemp(15);

		System.out.println(activity.determineActivity());
	}
}