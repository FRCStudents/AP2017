
public class Fib01{

	private int first;
	private int second;
	private int third;

	public Fib01(){
		first = 1;
		second = 1;
		third = 2;
	}

	public Fib01(int f, int s){
		first = f;
		second = s;
		third = f + s;
	}

	public void getNext(){
		first = second;
		second = third;
		third = second + first;
	}

	public void fibRecurse(int f, int s, int target){
		if (target < 1) return;
		System.out.print("[" + s + "]");
		fibRecurse(s, f+s, target - 1);
	}
	
	public void printLast(){
		System.out.println(third);
	}

}	
