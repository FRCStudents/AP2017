public class R{

	static int [] arr = new int[10];
	
	static public void printArr(){
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	static public void printArrB(){
		for (int i = arr.length; i > 0; i--){
			System.out.println(arr[i-1]);
		}
	}

	public static int printArrR(int n){
		if (n==0){
			return n;
		}

		System.out.println(arr[printArrR(n-1)]);
		return n;
	}

	public static int fac(int j){
		if (j == 1) return 1;
		return j*fac(j-1);
	}

	public static void main (String [] argv){
	

		for(int i = 0; i < arr.length; i++){
			arr[i] = i+1;
		}

		
		System.out.println(fac(5));

	}
}