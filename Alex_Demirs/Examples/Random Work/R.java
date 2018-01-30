class R{

	int [] arr = new int [10];

public static void main (String[] argv){
	R R=new R();
	for(int i=0;i<10;i++){
		R.arr[i]=i+1;
	}
	R.printArr();
	R.printArrB();
	R.printArrR(6);
}

public void printArr(){
	for(int i=0;i<10;i++){
		System.out.println(arr[i]);
	}
}

public void printArrB(){
	for(int i=9;i>-1;i--){
		System.out.println(arr[i]);
	}
}
public int printArrR(int n){
	if(n==0) return n;
	System.out.print(arr[n]);
	return printArrR(n-1);
}
}