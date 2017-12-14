public class R{

static int[] arr = new int[10];
	
public void printArr(){
	int h;
	for (h =0; h<= 9; h++){
		System.out.println(arr[h]);
	}
	 }

public void printArrB(){
	int w;
	for (w = 9; w>= 0; w--){
		System.out.println(arr[w]);
	 }
	}

public int printArrR(int n){
	if (n == 0) return n;
	System.out.println(arr [n-1]);
	return printArrR(n-1);
	}

public int fac (int j){
		if (j == 1) return 1;
		return j*fac(j-1);
	}

public static void main(String[] argv){
	int i;
	
	R u = new R();

	for (i = 0; i <= 9; i++){
		u.arr[i] = i+1;
		}

	System.out.println("Fowards Version: ");
	//u.printArr();	
	System.out.println("\nBackwards Version: ");
	//u.printArrB();
	u.printArrR(int n);
	}
}
