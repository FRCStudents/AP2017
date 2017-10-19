public class Mathematica {

	int num01;
	int num02;
	int num03;



	int getnum01(){
		return num01; 
}
	void setnum01 (int new_num01){
		num01 = new_num01;
}		


	int getnum02 (){
		return num02; 
}
	void setnum02 (int new_num02){
		num02 = new_num02;
}		


	int getnum03 (){
		return num03; 
}
	void setnum03 (int new_num03){
		num03 = new_num03;
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

		
	boolean isDividedBy(int p, int q ){
		return p % q == 0;	
	}

}