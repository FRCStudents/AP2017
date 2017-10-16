class APLine{
	private int a;
	private int b;
	private int c;

	public APLine(int beginningA, int beginningB, int beginningC){
		a = beginningA;
		b = beginningB;
		c = beginningC;
	}

	public int geta(){
		return a;
	}
	public void seta(int aa){
		a = aa;
	}
	public int getb(){
		return b;
	}
	public void setb(int bb){
		b = bb;
	}
	public int getc(){
		return c;
	}
	public void setc(int cc){
		c = cc;
	}
	public double getSlope(){

		return (double)-a/(double)b;
	}
	public boolean isOnLine(double x, double y){
		if((a*x) + (b*y) + c ==0){
			return true;
		}else{
			return false;
		}

	}
}