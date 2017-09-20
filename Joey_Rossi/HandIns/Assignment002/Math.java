class Math{

	int num01;
	int num02;
	int num03;

	int getNum01(){
		return num01;
	}
	int getNum02(){
		return num02;
	}
	int getNum03(){
		return num03;
	}
	void setNum01(int newNum01){
		num01 = newNum01;
	}
	void setNum02(int newNum02){
		num02 = newNum02;
	}
	void setNum03(int newNum03){
		num03 = newNum03;
	}	
	int add(int a, int b){
		return a+b;
	}
	
	int subtract(int a, int b){
		return a-b;
	}
	
	int multiply(int a, int b){
		return a*b;
	}
	
	double divide(int a, int b){
		return a/b;
	}
	
	boolean isDivisibleBy(int p, int q){
	
		 if (p > 1) return true; 
		 return false;
	}


}

	