	package APLine;

	public class APLine{
	int a;
	int b;
	int c;	

	public double getSlope(){
	return -1 * a/b;
	}

	boolean onLine(int x, int y){
	int answer = (a * x) + (b * y) + c;
	if (answer == 0) {
		return true;
		}
	else return false;
	}


}



