public class APComputerNERD{

	int inteligence;
	int speed;
	int laptopPreformance;
	String firstName;


//sets + gets
		public int getInteligence(){
			return inteligence;
		}

		public void setInteligence(int newInteligence){
			inteligence = newInteligence;
		}

		public int getSpeed(){
			return speed;
		}

		public void setSpeed(int newsSpeed){
			speed = newsSpeed;
		}

		public int getLaptopPreformance(){
			return laptopPreformance;
		}

		public void setLaptopPreformance(int newLaptopPreformance){
			laptopPreformance = newLaptopPreformance;
		}

		public String getFirstName(){
			return firstName;
		}

		public void setFirstName(String newFirstName){
			firstName = newFirstName;
		}

public void compareTo(int i, int j){
	if(i < j ){
		return 1;
	}
	if(j < i){
		return -1;
	}
}

public void swapArray(int arr[i]){
	int hold;
	hold = arr[i];
	arr[i] = arr[j];
	arr[j] = hold;
}
}