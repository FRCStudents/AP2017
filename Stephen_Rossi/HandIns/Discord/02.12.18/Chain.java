class Chain {
	public AC arr[] = new AC[5];

	public Chain(){
		arr[0] = new BigAC();
		arr[1] = new LittleAC();
		arr[2] = new BigAC();
		arr[3] = new VeryBigAC();
		arr[4] = new LittleAC();
	}

	public void setChain(){
		for(int i = 0; i < arr.length; i++){
			arr[i].turnOnAC();
		}
	}
	public void putInBox(){
		for(int i =0; i < arr.length;i++){
			arr[i].putInBox();
		}
	}
}