
class Lambda {
	String primeList = "";
	public Lambda(){
		buildString();
	}

	public Lambda(int i){
		this();
		System.out.println("Your Number: " + getNumber(i));
	}

	public String getNumber(int idx){
		String s = "";
		for(int i=0; i<5; i++){
			s += primeList.charAt(idx + i);
		}
		return s;
	}

	private void buildString(){
		int len = 0;
		int nextPrime = 1;
		while (len < 10000){
			nextPrime = nextPrime(nextPrime + 1);
			primeList += Integer.toString(nextPrime);
			len = primeList.length();
		}
	}

	private boolean isPrime(int i){
		for(int j=2; j<i/2; j++){
			if(i % j == 0) return false;
			}
		return true;
	}

	private int nextPrime(int i){
		if(isPrime(i)) return i;
		return nextPrime(i + 1);
	}

	public void showList(){
		System.out.println(primeList);
	}
}
