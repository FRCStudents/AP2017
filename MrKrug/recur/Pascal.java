
class Pascal {
	// 
	// array patterns
	// 
	static void printArray(int[] line){
		for(int i=0; i<line.length; i++){
			System.out.print("{" + line[i] + "}");
		}
	}

	//
	// this function starts each line
	// calling nLine
	//
	static int[] nLineStart(int[] line, int  idx){
		int[] newLine = new int[line.length + 1];
		return nLine(newLine, line, 0);
	}

	//
	// called from nLineStart
	// This function actually creates the array based
	// on the previous line (array)
	//
	static int[] nLine(int[] newLine, int[] line, int idx){
		if(idx == 0){
			newLine[0] = 1;
			return nLine(newLine, line, 1);
		}
		if(idx > line.length - 1){
			newLine[line.length] = 1;
			return newLine;
		}
		newLine[idx] = line[idx - 1] + line[idx];
		return nLine(newLine, line, idx+1);
	} 

	//
	// recursive function
	// recursively prints each line of the pascal
	// triangle - counting down to 0
	//
	static void doitRec(int[] arr, int count){
		if(count == 0){
			return;
		}

		arr = nLineStart(arr, 0);
		printArray(arr);
		System.out.println("");
		doitRec(arr, count - 1);
	}

	public static void main(String[] argv){
		int[] arr = {1};
		printArray(arr);
		System.out.println("");
		doitRec(arr, 10);

	}
}	
