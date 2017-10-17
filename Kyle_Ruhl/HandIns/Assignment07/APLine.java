	public class APLine{
	int a;
	int b;
	int c;	

	//Constructor--
	public APLine(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getSlope(){
	return  (double)-a/(double)b;
	}

	boolean isOnLine(int x, int y){
	int answer = ((a * x) + (b * y) + c);
	if (answer == 0) {
		return true;
		}
	else return false;
	}
}