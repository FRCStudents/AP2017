import java.util.*;

public class magic8{

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
	String goOn = "Yes";

//This method is asking the user what question they want to get advice on
	public void askQuestion() {
		
		for (int x = 0; x <= 20; x++){ 
			System.out.println(); //clearing screen to enter magic 8 simulator
			}
			
				System.out.println("Welcome to the Magic 8 Ball!");
				System.out.println("Please ask me your question!");
				System.out.println("It must be a yes or no question: ");
				System.out.println();
				question = s.nextLine();
			}

//using math.random to determine which random response the user will recieve
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
		
		if ((int)(1 + Math.random() * 10) >= 10) {
			System.out.println(j);
			return j;
	
			} else { 
	//returns when the math fails:
				for (int x = 0; x <= 10; x++){ 
					System.out.println(); //this prints 20 or so blank lines
					}
				System.out.println("Sorry, Magic 8 Machine Broke!");
				System.out.println();
				System.out.println("Try Again by typing 'y', exit by typing 'n'");
				System.out.println();
				return "bye";
			}
		}

	public String anotherQuestion() {
		System.out.println("Do you have any more questions? y/n");
		goOn = s.nextLine();
		return goOn;
	}

	public void continueing(String anotherQuestion) {
		if (anotherQuestion.equals("y")) {
			goOn = "Yes";
		}else{
			if (anotherQuestion.equals("n")) {
				goOn = "No";
				System.out.println("Goodbye.");
					}else{
						for (int x = 0; x <= 20; x++){ 
							System.out.println(); //this prints 20 or so blank lines to show that the user has caused the error by not imputing y or n
							}
							
							//this forces the user to imput either 'y' or 'n'
						System.out.println("YOU HAVE CAUSED AN ERROR!");
						System.out.println("To ask another question, type 'y'");
						System.out.println("To exit the Magic 8 Ball, type 'n'");
						System.out.println("**********************************");
						continueing(anotherQuestion());
							}
		}
	}
}