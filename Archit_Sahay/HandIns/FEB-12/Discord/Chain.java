public class Chain{

AC[] ChainArr = new AC[5];

public Chain(){
	ChainArr[0] = new LittleAC();
	ChainArr[1] = new BigAC();
	ChainArr[2] = new VeryBigAC();
	ChainArr[3] = new BigAC();
	ChainArr[4] = new BigAC();
}

public void showChain(){
	for (int i = 0; i < ChainArr.length; i++){
		System.out.println(ChainArr[i]);
	}
}

public void SetChain(){
	for (int i = 0; i < ChainArr.length; i++){
		ChainArr[i].turnOnAC();
	}
}

}		