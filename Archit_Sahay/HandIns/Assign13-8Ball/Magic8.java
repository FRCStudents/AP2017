import java.util.*;

public class Magic8{

	Scanner s = new Scanner(System.in); 

	//These are the 10 options from the assignment sheet to return:
	String a = "?Concentrate and Ask Again?" ;
	String b = "Don't Count on It";
	String c = "It Is Certain";
	String d = "Most Likely";
	String e = "My Reply is No";
	String f = "My Sources Say No";
	String g = "No";
	String h = "Outlook Good";
	String i = "Yes, Definitely";
	String j = "You May Rely On It";

 int number = (int)(1 + Math.random() * 10);


	String question;
	String Next = "Yes";


	public void askQuestion() {
		
					
				System.out.println("Welcome to the Magic 8 Ball!");
				System.out.println("Please ask me your question!");
				System.out.println("Please make sure it is a yes or no question: ");
				System.out.println();
				question = s.nextLine();
			}

	public String Answer() {
		
		if ((int)(1 + Math.random() * 10) == 1) {
			System.out.println(a);
			return a;
			}
		
		if ((int)(1 + Math.random() * 10) == 2) {
			System.out.println(b);
			return b;
			}
	
		if ((int)(1 + Math.random() * 10) == 3) {
			System.out.println(c);
			return c;
			}
	
		if ((int)(1 + Math.random() * 10) == 4) {
			System.out.println(d);
			return d;
			}
	
		if ((int)(1 + Math.random() * 10) == 5) {
			System.out.println(e);
			return e;
			}
		
		if ((int)(1 + Math.random() * 10) == 6) {
			System.out.println(f);
			return f;
			}
	
		if ((int)(1 + Math.random() * 10) == 7) {
			System.out.println(g);
			return g;
			}
	
		if ((int)(1 + Math.random() * 10) == 8) {
			System.out.println(h);
			return h;
			}
	
		if ((int)(1 + Math.random() * 10) == 9) {
			System.out.println(i);
			return i;
			}
		
		if ((int)(1 + Math.random() * 10) == 10) {
			System.out.println(j);
			return j;
	
			} 
			return "1";
		}

	public String moreQuestion() {
		System.out.println("Do you have any more questions? Please say y or n");
		Next = s.nextLine();
		return Next;
	}

	public void continueing(String anotherQuestion) {
		if (anotherQuestion.equals("y")) {
			Next = "Yes";
		}else{
			if (anotherQuestion.equals("n")) {
				Next = "No";
				System.out.println("Goodbye.");
					
		}
	}
}
}