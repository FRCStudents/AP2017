
class EquationModule{
	/* form: y = mx + b */
	int m;
	int b;
	int x;

	public EquationModule(int m, int b){
		this.m = m;
		this.b = b;
		}

	public EquationModule(){
		this(10, 5);
		}

	public int getSlope(){
		return this.m;
		}

	public int getYIntercept(){
		return this.b;
		}

	public int getY(int x){
		return (x * this.m) + this.b;
		}

	public String toString(){
		return "Equation: y = " + m + "x + " + b;
		}
}

class Equation {
	public static void main(String argv[]){
		System.out.println("Equation: ");
		EquationModule e = new EquationModule(5, 15);
		System.out.println(e);
		System.out.println("Slope: " + e.getSlope());
		for(int i=0; i<20; i++){
			System.out.println("for x = " + i + ": y = " + e.getY(i));
			}
	}
}

