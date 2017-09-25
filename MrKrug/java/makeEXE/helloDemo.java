package start;
import java.io.*;

class hello {
	private String x = "";
	public hello(){
			System.out.println("Constructor:" + x);
	}

	public hello(String p){
			this();
			this.x = p;
			System.out.println("Other Constructor: " + this.x);
	}

	public hello(int i){
		this();
		for(int j=i; j > 0; j--){
			this.x += "Yada";
		}
	}

	public void display(){
		System.out.println(this.x);
	}

	public String word (){
		x += "hi";
		return x;
	}
}

/*********************************************
 *********************************************/

public class helloDemo {
	public static void main(String[] args){
		hello h = null;
		h = new hello(4);
		h.display();
		}
	}
