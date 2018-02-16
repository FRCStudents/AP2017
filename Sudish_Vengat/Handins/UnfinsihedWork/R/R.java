public class R {

	int [] arr = new int [10];

	public int printArr(){
		for(int i = 0; i < arr.length; i++){
			return arr;
		}
	}

	public int printArrB(){
		for(int i = 10; i > arr.length; i--){
			return arr;
		}
	}

	public int printArrR(int n){
		if(n == 9){
			return arr[9];
		}
		System.out.println(printArr(n+1));
	}
}						