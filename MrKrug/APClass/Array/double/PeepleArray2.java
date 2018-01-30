
class PeepleArray2 {
	String [][] peeple = new String[10][5];
	int peeplePointer = -1;

	public PeepleArray2(String s1, String s2, String s3, String s4, String s5){
		setPeeple(s1, s2, s3, s4, s5);
	}

	public void showPeeple(){
		for(int i=0; i<5; i++){
			System.out.println(peeple[peeplePointer][i]);
		}
	}

	public void showAllPeeple(){
		System.out.println("pPointer: " + peeplePointer);
		int pPointer = peeplePointer;

		for(int i=0; i <= pPointer; i++){
			peeplePointer = i;
			showPeeple();
		}
		peeplePointer = pPointer;
	}

	public void nextPerson(){
		if(peeplePointer < 8){
			peeplePointer++;
		}
	}

	public void previousPerson(){
		if(peeplePointer > 0){
			peeplePointer--;
		}
	}

	public void setPeeple(String s1, String s2, String s3, String s4, String s5){
		peeplePointer++;
                peeple[peeplePointer][0] = s1;
                peeple[peeplePointer][1] = s2;
                peeple[peeplePointer][2] = s3;
                peeple[peeplePointer][3] = s4;
                peeple[peeplePointer][4] = s5;
	}

	public String[] getPeeple(){
		return peeple[peeplePointer];
	}

	public String getFName(){
		return peeple[peeplePointer][0];
	}

	public String getLName(){
		return peeple[peeplePointer][1];
	}

	public String getHeight(){
		return peeple[peeplePointer][2];
	}

	public String getAddress(){
		return peeple[peeplePointer][3];
	}

	public String getPhone(){
		return peeple[peeplePointer][4];
	}
}
