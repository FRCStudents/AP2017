
/******************************************************
 * Assignment 1: 
 *     1) Print out the +/- numbers around the corners 
 *     2) Print out 'U' for 1 and 'D' for 0 - but 
 * 		do NOT change the array... only what
 *		you are printing
 *     3) For tom - 
 * 		Using a bitwise compare...
 * 
 ******************************************************/

class PrintBinNums {
	public static int pow(int n){
		if (n < 0) return 0;
		if (n == 0) return 1;
		return 2 * pow(n - 1);
	}

	public static int[] findTarget (){
		int[] arr = new int[5];
		int x = 1;
		while (x > 0){
			arr[4] = arr[3];
			arr[3] = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = x;
			x++;
			}
		return arr;
	}

	public static void printBinary(int u){
                char[] binArr = new char[32];
                int i = 0;
		System.out.println();
                System.out.print(u);
                while(i < 32){
                        if((u & 1) > 0){
                                binArr[i++] = '1';
                                }
                        else {
                                binArr[i++] = '0';
                        }
                        u = u >> 1;
                        }
                System.out.print(" in binary: \t");
                for(i=binArr.length-1; i >= 0; i--){
                        System.out.print(binArr[i]);
                        }

	}


	public static void main (String[] args){
		int[] iArr = findTarget();
		int u = iArr[0];
		printBinary(1);
		printBinary(38);
		printBinary(143);
		printBinary(u);
		printBinary(u+1);	
		System.out.println();
	}
}
