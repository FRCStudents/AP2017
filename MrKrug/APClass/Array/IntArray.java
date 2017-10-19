
class IntArray {
	public static void printArray(String[] sArray){
		System.out.println("\n\n\nString Array: ");
		for(int i=0; i < sArray.length; i++){
			System.out.print("\n[" + sArray[i] + "]");
			}
		System.out.println("");
	}

	public static void printArray(int[] pArray){
		System.out.println("\n\n\nInt Array: ");
		for(int i=0; i < pArray.length; i++){
			System.out.print("[" + pArray[i] + "]");
			}
		System.out.println("");
	}

	public static String[] getStringArray(){
		String[] sArray = new String[5];
		String s = ""; 

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				s += "[Huh-Hah]"; 
			}
			sArray[i] = s;
			s = "";
		}		
		return sArray;
	}

	public static void main(String [] argv){
		int[] theArray = new int[10];
		for(int i=0; i < theArray.length; i++){
			theArray[i] = i;
			if(i > 0){
				theArray[i] = theArray[i-1] + theArray[i];
			}
		printArray(theArray);

		}
		printArray(getStringArray());
	}
	
}
