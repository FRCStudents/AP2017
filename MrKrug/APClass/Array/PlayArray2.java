
class PlayArray2 {
	public static void main(String [] argv){
		String[] theArray = new String[10];

		// load the array with char 
		char c = 'a';

		for(int i=0; i < theArray.length; i++){
			theArray[i] = "";
			}

		for(int i=0; i < theArray.length; i++){
			for(int j=0; j < 10; j++){
				theArray[i] += c;
				if(c > 'y'){
					c = 'a';
				} else {
					c++;
				}
			}
		}

		// print to terminal

		for(int i=0; i < theArray.length; i++){
			System.out.print("\n[" + theArray[i] + "]");
		}
	}

}
