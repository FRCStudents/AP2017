import java.util.*;

class EightBall {

	Scanner s = new Scanner(System.in); // allows user input

	// Possible responses
	private String a = "Concentrate and ask again" ;
	private String b = "Don't count on it";
	private String c = "It is certain";
	private String d = "Most likely";
	private String e = "My reply is \"no\"";
	private String f = "My sources say \"no\"";
	private String g = "No";
	private String h = "Outlook good";
	private String i = "Yes, definitely";
	private String j = "You may rely on it";

	// Random number
	private int number = (int)(1 + Math.random() * 10);

	// Attribute for the current question
	private String question;
	public String goOn = "Yes";

	// METHODS
	public void askQuestion() {
		System.out.println("Welcome to the Magic Eight Ball!");
		System.out.println("Please ask a yes or no question.");
		question = s.nextLine();
	}

	public String formAnswer() {
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
		} else {
			System.out.println(a);
			return a;
		}
	}

	public String additionalQuestions() {
		System.out.println("Do you have any more questions? Yes/No");
		goOn = s.nextLine();
		return goOn;
	}

	public void yesOrNo(String additionalQuestions) {
		if (additionalQuestions.equals("Yes")) {
			goOn = "Yes";
		}
		if (additionalQuestions.equals("No")) {
			goOn = "No";
			System.out.println("Thank you, goodbye!");
		}
		if (!additionalQuestions.equals("Yes") && !additionalQuestions.equals("No")) {
			System.out.println("Please respond with Yes or No");
			yesOrNo(additionalQuestions());
		}
	}

}