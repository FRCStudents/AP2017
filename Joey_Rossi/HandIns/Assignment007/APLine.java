class APLine {
	
	int a;
	int b;
	int c;

	public APLine(int startingA, int startingB, int startingC){
		a = startingA;
		b = startingB;
		c = startingC;
	}

	int getA(){
		return a;
	}
	int getB(){
		return b;
	}
	int getC(){
		return c;
	}
	void setA(int newA){
		a = newA;
	}
	void setB(int newB){
		b = newB;
	}

	/*returnType functionName (parameterType parameterName){/*
		/* function body */
	

	void setC(int newC){
		c = newC;
	}
	double getSlope(){
		return (double)-a/b;
	}
	boolean isOnline(double x,double y){
		if ((a*x) + (b*y) + c == 0){
		 	return true;
		}else{
			return false;
		}
	}
}