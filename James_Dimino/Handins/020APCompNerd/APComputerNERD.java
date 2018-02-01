public class APComputerNERD {

	private String firstName;
	private int intelligence;
	private int speed;
	private int laptopPerformance;

	int testArr[] = {3, 5, 6, 2, 4};
	int testArr2[] = {0, 0, 0, 0, 0};

	public APComputerNERD(){
		firstName = " ";
		intelligence = 0;
		speed = 0;
		laptopPerformance = 0;
	}

	public void sort(){
		int temp = 0;
		for (int j = 0; j < testArr.length; j++){
			int lastPlace = 0;
				for (int i = 0; i < testArr.length; i++){
					if (testArr[i] < temp){
						temp = testArr[i];
						lastPlace = i;
						testArr2[j] = testArr[i];
					}
				}
			testArr[lastPlace] = 999;	
		}
	}

	public void printTest(){
		for (int i = 0; i < testArr.length; i++){
			System.out.println(testArr[i]);
		}
	}

	public String getName() {
		return firstName; 
	}

	public void setName(String n) { 
		firstName = n; 
	}

	public int getIntelligence() { 
		return intelligence; 
	}
	
	public void setIntelligence(int i) { 
		intelligence = i; 
	}

	public int getSpeed() { 
		return speed; 
	}
	
	public void setSpeed(int s) { 
		speed = s; 
	}

	public int getLaptopPerformance() {
		return laptopPerformance; 
	}

	public void setLaptopPerformance(int p){  
		laptopPerformance = p;	
	}


}