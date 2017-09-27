public class APLine{
	int a;
	int b;
	int c;
	double slope;

	public APLine(int pa, int pb, int pc){
		a = pa;
		b = pb;
		c = pc;
	}

	double getSlope(){]
		return -a/b;
	}

	boolean isOnLine(int x, int y){
		return (a*x)+(b*y)+c == 0;
	}
}