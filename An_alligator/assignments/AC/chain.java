class chain{

	AC[] o=new AC[3];
	
	chain(){
		o[0]=new littleAC();
		o[1]=new bigAC();
		o[2]=new veryBigAC();
	}
	
	public void setChain(int g,int h,int j){
		o[0].AC0 = g;
		o[1].AC0 = h;
		o[2].AC0 = j;
	}

	public void showChain(){
		for(int l=0; l<o.length; l++){
			o[l].putInBox();
		}
	}

}
