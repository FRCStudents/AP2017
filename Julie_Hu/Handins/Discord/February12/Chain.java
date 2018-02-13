public class Chain{

AC[] arr = new AC[5];

public Chain(){
	this.arr[0] = new LittleAC();
	this.arr[1] = new BigAC();
	this.arr[2] = new VeryBigAC();
	this.arr[3] = new BigAC();
	this.arr[4] = new BigAC();
}

public void showChain(){
	for (int i = 0; i < arr.length; i++){
		arr[i].putInBox();
	}
}

public void SetChain(){
	for (int x = 0; x < arr.length; x++){
		arr[x].turnOnAC();
	}
}

}