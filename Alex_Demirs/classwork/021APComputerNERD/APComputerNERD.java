public class APComputerNERD{

	int inteligence;
	int speed;
	int laptopPreformance;
	String firstName;

public APComputerNERD(int i, int s, int l, String f){
	inteligence = i;
	speed = s;
	laptopPreformance = l;
	firstName = f;
}

public APComputerNERD(){
}

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

public int toCompare(int x, int y){
	if(x == y){
		return 0;
	}
	if(x > y){
		return 1;
	}
	if(x < y){
		return -1;
	}

	return 2;
}

	public void swapObject(int i, int j, Object[] objArray) {
		Object hold = objArray[i];
		objArray[i] = objArray[j];
		objArray[j] = hold;
	}


}