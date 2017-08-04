
class Inside {
	private int p;
	public  int u;
	public Inside(){
		p = 10;
		u = 50;
		}

	public void print(){
		System.out.println("Printing attributes - p(private): " + p + " and u(public): " + u);
		}
	}

public class Private{
	public static void main(String [] argv){
		Inside i = new Inside();
		i.print();
		i.u = 99;
		i.print(); 
	}
} 
