
class Face2{
	public static void printBlanks(int i){
		for(int x=0; x < i; x++){
			System.out.print(' ');
			}
		}

	public static void printChar(char c){
		System.out.print(c);
		}

	public static void main(String argv[]){
		//
		// time to start thinking...
		// let's create a circle type thing
		//
		int line = 0;
		int size = 30;
		int halfSize = 30/2;
		for (int i=0; i < size+1; i++){
			if(i < halfSize + 1){
				printBlanks(10);
				printBlanks(halfSize - i);
				printChar('*');
				printBlanks((halfSize - (halfSize - i))*2);
				printChar('*');
				}
			else {
				printBlanks(10);
				printBlanks(halfSize - (size - i));
				printChar('*');
				printBlanks((size - (halfSize - (size - i)) * 2));
				printChar('*');
				}			
			System.out.println();
		}
	}
}

