
class Rexu {
static int [] arr = new int[10];

static void init(){
	for(int i=0; i< 10; i++){
		arr[i] = i + 1;
	}
}

static int pArrF(int j){
	if(j == 0) return arr[j];
	System.out.print(pArrF(j-1));
	return arr[j];
}

static int pArrB(int j){
	if(j == 0) return j;
	System.out.print(arr[j-1]);	
	return pArrB(j - 1);
}

public static void main(String[] argv){
	init();
	System.out.println("----------- Forwards ---------------\n");
	pArrF(9);
	System.out.println();
	System.out.println("----------- and back ---------------\n");
	pArrB(10);
	System.out.println();
	}
}
