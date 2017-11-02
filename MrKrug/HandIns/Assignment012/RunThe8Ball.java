import java.util.*;

class RunThe8Ball{
	static String q,a,r = "y";
	static Scanner scanner = new Scanner(System.in); 
	static boolean sw = false; 
	public static void main(String[] argv){
		The8Ball t8b = new The8Ball();
		System.out.println("Ask a yes/not question: ");
		while(r.toLowerCase().indexOf("y") > -1){
			if(sw){
				System.out.println("Go ahead...");
				}
			sw = true;
			q = scanner.nextLine();
			a = t8b.getResponse();
			System.out.println(q + "-->" + a);
			System.out.println("Would you like to ask another question? ");
			r = scanner.nextLine();
		}
	}
}
