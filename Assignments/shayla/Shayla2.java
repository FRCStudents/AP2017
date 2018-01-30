
class Shayla2 {
	String[][] shaylaArr1 = new String[4][5];
	int[][] shaylaArr2 = new int[4][5];

	public Shayla2(){
		initShaylaArr1("Thing");
		initShaylaArr2(0);
	}

	private void initShaylaArr1(String s){
		for(int i=0; i < shaylaArr1.length; i++){
			for(int j=0; j < shaylaArr1[i].length; j++){
				shaylaArr1[i][j] = s;
			}
		}
	}

	private void initShaylaArr2(int n){
		for(int i=0; i < shaylaArr2.length; i++){
			for(int j=0; j < shaylaArr2[i].length; j++){
				shaylaArr2[i][j] = n;
			}
		}
	}

	//
	// 1)
	// Oops! I forgot to fix this function when I copied my code
	// to this new object - please fix it for me!
	// This function should set some spot in shaylaArr1 to
	//	a specific String value
	//
	public void setShaylaArr1(int i, String s){
		//shaylaArr1[i] = s;
	}

        //
    	// 2)  
	// Oops! I forgot to fix this function when I copied my code
        // to this new object - please fix it for me!
        // This function should set some spot in shaylaArr2 to
        //      a specific int value
        //

	//public String getShaylaArr1(int i){
	//	return shaylaArr1[i];
	//}	

	//
	// 3)
	// This function displays shaylaArr1 as a grid
	//
	//public void showShaylaArr1(){
		// please code this function
	//}
 
	//
	// 4)
	// This function displays shaylaArr2 as a grid
	//
	public void showShaylaArr2(){
		// please code this function
	}
}	
