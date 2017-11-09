public class Mathematica{

		int num01;
		int num02;
		int num03;

		int getCurrentNum01(){
			return num01;
		}
		void setCurrentNum01(int newNum01){
			num01 = newNum01;
		}

		int getCurrentNum02(){
			return num02;
		}

		void setCurrentNum02(int newNum02){
			num02 = newNum02;
		}

		int getCurrentNum03(){
			return num03;
		}

		void setCurrentNum03(int newNum03){
			num03 = newNum03;
		}

		


		int add(int a, int b){
			return a + b;

		}
		
		int subtract(int a, int b){

			return a - b;
		}

		int multiply(int a, int b){

			return a * b;
		}


		double divide(int a, int b){
			double c=a;
			double d=b;
			return c / d;
		}


		boolean isDivisibleBy(int a, int b){
			return a%b==0;
		}
}
