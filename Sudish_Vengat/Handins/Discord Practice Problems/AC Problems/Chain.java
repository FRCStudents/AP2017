public class Chain {

	AC[] array = new AC[5];

	public Chain(){
		array[0] = new BigAC();
		array[1] = new LittleAC();
		array[2] = new VeryBigAC();
		array[3] = new BigAC();
		array[4] = new LittleAC(); 
	}

	public void showChain(){
		for(int s = 0; s < array.length; s++){
			array[s].putInBox();
		}
	}

	public void setChain(){
		for(int j = 0; j < array.length; j++){
			array[j].turnOnAC();
		}
	}
}