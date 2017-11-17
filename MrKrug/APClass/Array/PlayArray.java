
class PlayArray {
	static int [] gArr;  
	
	public static void setArray(int[] arr){
		gArr = arr;
	}

	public static void main(String [] argv){
		int[] theArray = new int[10];

		// load the array with ints

		for(int i=0; i < theArray.length; i++){
			theArray[i] = (20 - i) * 3;
		}

		// print to terminal

		for(int i=0; i < theArray.length; i++){
			System.out.print("[" + theArray[i] + "]");
		}
		setArray(theArray);
		for(int i=0; i < gArr.length; i++){
			System.out.print("{" + gArr[i] + "}");
		}
	}

}
