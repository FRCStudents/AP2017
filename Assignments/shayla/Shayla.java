
class Shayla {
	String[] shaylaArr1 = new String[4];
	int[] shaylaArr2 = new int[4];

	public Shayla(){
		initShaylaArr1("Thing");
		initShaylaArr2(0);
	}

	private void initShaylaArr1(String s){
		for(int i=0; i < shaylaArr1.length; i++){
			shaylaArr1[i] = s;
		}
	}

	private void initShaylaArr2(int n){
		for(int i=0; i < shaylaArr2.length; i++){
			shaylaArr2[i] = n;
		}
	}

	public void setShaylaArr1(int i, String s){
		shaylaArr1[i] = s;
	}

	public String getShaylaArr1(int i){
		return shaylaArr1[i];
	}	

}	
