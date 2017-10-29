
class Money {
	private int quarters;
	private int dimes;
	private int nickles;
	private int pennies;

	public Money(){
		this(0,0,0,0);
	}

	public Money(int q, int d, int n, int p){
		quarters = q;
		dimes = d;
		nickles = n;
		pennies = p;
	}

	public int addCoins(){
		int d = 25 * quarters;
		d += (10 * dimes);
		d += (5 * nickles);
		d += pennies;
		return d;
	}

	public void setQuarters(int q){
		quarters = q;
	}

	public void setDimes(int d){
		dimes = d;
	}

	public void setNickles(int n){
		nickles = n;
	}

	public void setPennies(int p){
		pennies = p;
	}
}
