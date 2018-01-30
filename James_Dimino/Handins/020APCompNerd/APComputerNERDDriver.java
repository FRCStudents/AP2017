public class APComputerNERDDriver {

	static int testArr[] = {3, 5, 6, 2, 4};
	static int testArr2[] = {0, 0, 0, 0, 0};

	public static void sort(){
		int temp = 999;
		for (int j = 0; j < testArr.length; j++){
			int lastPlace = -1;
				for (int i = 0; i < testArr.length; i++){
					System.out.println("ABOVE" + temp);
					if (testArr[i] < temp){
						System.out.println("HERE:" + testArr[i] + "::" + temp);
						temp = testArr[i];
						lastPlace = i;
						testArr2[j] = testArr[i];
					}
				}
			testArr[lastPlace] = 999;	
		}
	}

	public static void printTest(){
		for (int i = 0; i < testArr.length; i++){
			System.out.println(testArr[i]);
		}
	}

	public static void main(String[] argv){

	APComputerNERD a = new APComputerNERD();

	sort();
	printTest();

	}
}
