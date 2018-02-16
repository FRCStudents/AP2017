class tDriver{
	public static void main(String[] args){
		littleAC x = new littleAC();
		bigAC y = new bigAC();
		veryBigAC z = new veryBigAC();
		chain f = new chain();


		x.prt("");
		y.prt("LITTLE BOIIS");
		x.prt(x.AC0);
		x.prt(x.AC1);
		y.prt("");
		y.prt("BIG BOIIS");
		y.prt(y.AC0);
		y.prt(y.AC1);
		z.prt("");
		z.prt("VERY BIG BOIIS");
		z.prt(z.AC0);
		z.prt(z.AC1);

		x.prt("");
		x.prt("DEFAULT putInBox()");
		for(int l=0; l<5; l++){
			x.putInBox();
			x.AC0 = x.AC0*10;
		}

		x.prt("");
		x.prt("DEFAULT CHAIN");
		f.showChain();
		x.prt("");
		x.prt("SET CHAIN");
		f.setChain(100,213,1234);
		f.showChain();

	}
}
