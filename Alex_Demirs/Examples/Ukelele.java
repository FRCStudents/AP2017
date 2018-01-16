public class Ukelele {
	private static String[][] shaylaArr1 = new String[4][5];
	public static String[] ukeleleSentence = {"My", "Dog", "Has", "A", "Ukelele"};

	public static void fillWithSentence(String[] s) {
		String[] tempArr = new String[s.length];
		int counter = 0;
		for (int i = 0; i < shaylaArr1.length; i++) {
			counter = i;
			for(int j = 0; j < tempArr.length; j++) {
				if (counter == tempArr.length) {
					counter = 0;
				}
				tempArr[j] = s[counter];
				counter++;
			}
			for (int j = 0; j < tempArr.length; j++) {
				shaylaArr1[i][j] = tempArr[j];
			}
		}
	}

	public static void showShaylaArr1(){
   		for(int i = 0; i < shaylaArr1.length; i++){
        	for(int j=0; j < shaylaArr1[i].length; j++){
            	System.out.print(shaylaArr1[i][j] + " ");
            }
        	System.out.println(" ");
    	}
	}

	public static void main(String[] argv) {

		fillWithSentence(ukeleleSentence);
		showShaylaArr1();




	}

}