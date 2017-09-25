class Mathematica {
	private int num01; 
	private int num02;
	private int num03;

	public int getnum01(){
		return num01;
	}
	public void setnum01(int x){
		num01 = x;
	}
	public int getnum02(){
		return num02;
	}
	public void setnum02(int y){
		num02 = y;
	}
	public int getnum03(){
		return num03;
	}
	public void setnum03(int z){
		num03 = z;
	}
	public int add(int a, int b){
		return a + b;
	}
	public int subract(int a, int b){
		return a - b; 
	}
	public int multiply(int a, int b){
		return a*b;
	}
	public double divide(int a, int b){
		return (double) a/(double) b;
	}
	public boolean isDivisibleBy(int p, int q){
		if (p % q == 0) {
			return true;
			}else{ 
			return false;
			}

	}
	

}