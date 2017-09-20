public class Mathematica {

int num01;
int num02;
int num03;

//Num01
	int getNum01(){
		return num01;
	}

	void setNum01(int newNum01){
		num01=newNum01;
	}

//Num02
	int getNum02(){
		return num02;
	}

	void setNum02(int newNum02){
		num02=newNum02;
	}
//Num03
		int getNum03(){
		return num03;
	}

	void setNum03(int newNum03){
		num03=newNum03;
	}

//Add, Subtract, multply, divide, boolean

	int add(int a, int b){
		int answer = a+b;
		return answer;
	}
	
	int subtract(int a, int b){
		int answer = a-b;
		return answer;
	}

	int multply(int a, int b){
		int answer = a*b;
		return answer;
	}

	double divide(int a, int b){
		int answer = a/b;
		return answer;
	}

	boolean validateNum (int n){
	if (n >= 0) return true;
	return false;
	}
	
	//String ToString
	String toString;
		public String toString(){
		return "Answers";
	}
}