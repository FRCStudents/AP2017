public class APComputerNERD {
	
	private int intelligence;
	private int speed;
	private int laptopPerformance;
	private String firstName;

	int testArr[] = {3, 5, 6, 2, 4};
	int testArr2[] = {0, 0, 0, 0, 0};

	public APComputerNERD(){
		//hmmmm.... constructor you say?
	}

	public void sort(){
		int temp = 0;
		for (int j = 0; j < testArr.length; j++){
			int lastPlace = -1;
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


}