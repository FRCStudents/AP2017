
class PeepleArray {
	String [] peeple = new String[5];
	public PeepleArray(String s1, String s2, String s3, String s4, String s5){
		peeple[0] = s1;
		peeple[1] = s2;
		peeple[2] = s3;
		peeple[3] = s4;
		peeple[4] = s5;
	}

	public void showPeeple(){
		for(int i=0; i<5; i++){
			System.out.println(peeple[i]);
		}
	}

	public String getFName(){
		return peeple[0];
	}

	public String getLName(){
		return peeple[1];
	}

	public String getHeight(){
		return peeple[2];
	}

	public String getAddress(){
		return peeple[3];
	}

	public String getPhone(){
		return peeple[4];
	}
}
