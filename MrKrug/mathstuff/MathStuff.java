
public class MathStuff {
	int number01;
	int number02;
	int number03;

	String label1;
	String label2;
	String label3;

	char operator;

	public MathStuff(){
		number01 = 0;
		number02 = 0;
		number03 = 0;
		label1 = "";
		label2 = "";
		label3 = "";

		operator = '_';
	}

	private boolean isEven(int x){
		if(x % 2 == 0){
			return true;
		}
		return false;
	}

	private boolean isPositive(int x){
		if(x > 0){
			return true;
		}
		return false;
	}

	private boolean isZero(int x){
		if(x == 0){
			return true;
		}
		return false;
	}

	private boolean isPrime(int x){
		for(int i=2; i < x/2; i++){
			if(x % i == 0) return false;
		}
		return true;
	}


