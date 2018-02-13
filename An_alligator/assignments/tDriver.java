class tDriver{
	public static void main(String[] args){
		littleAC x = new littleAC();
		bigAC y = new bigAC();
		x.prt(x.AC0);
		x.prt(x.AC1);
		y.prt(y.AC0);
		y.prt(y.AC1);
		for(int l=0; l<5; l++){
			x.putInBox();
			x.AC0 = x.AC0*10;
		}
	}
}
