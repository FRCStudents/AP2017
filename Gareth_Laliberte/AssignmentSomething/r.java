public class R{
	
	public static void main(String[] argv){

		for(int i = 0; i < arr.length; i++){
			arr[i] = i + 1;
		}

	int[] arr = new int[10];

	public static printArray(){
		for (i = 0; i <= 10; i++){
			System.out.println(arr[i]);
		}
	}

	public static printArrayB(){
		for(i = 0; i >= 10; i--){
			System.out.println(arr[i]);
		}
	}

	int printArrR(int n){
		if (n == 9){
			return arr[9];
		}

		System.out.print(PrintArrR(n+1));

		return arr[n+1];
	}


	
		
	}

	printArray();
	printArrayB();
}