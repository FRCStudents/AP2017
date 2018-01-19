public class APComputerNERDDriver {

	static int testArr[] = {3, 5, 6, 2, 4};
	static int testArr2[] = {0, 0, 0, 0, 0};

	public static void sort(){
		int temp = 999;
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

	public static void main(String[] argv){

	APComputerNERD a = new APComputerNERD();

	a.sort();
	a.printTest();

	}
}