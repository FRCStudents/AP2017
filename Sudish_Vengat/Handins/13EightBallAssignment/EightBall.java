import java.util.*;

public class EightBall {

	Scanner s = new Scanner(System.in);

    private String[] responses = {

    	"Concentrate and Ask Again",
    	"Don't Count on It",
    	"It Is Certain",
    	"Most Likely",
    	"My Reply is No",
    	"My Sources Say No",
    	"No",
    	"Outlook Good",
    	"Yes, Definitely",
    	"You May Rely On It"};

    private int random_response = (int)(1 + Math.random() * 10); 
    private String question; 
    public String continue_on = "Yes";


	    public void askQuestion(){
	    	System.out.println("Ask a yes or no question");
	    	question = s.nextLine();
	    }

	    public void getResponseOne(){
	    	for(int i=0; i<responses.length; i++);
	    	System.out.println(responses[(random_response)]);
	    }

	    public String anotherQuestion() {
		System.out.println("Want to ask another question, Yes or No?");
		continue_on = s.nextLine();
		return continue_on;

		}

		public void yesOrNoQuestion(String anotherQuestion) {
		if (anotherQuestion.equals("Yes")) {
			continue_on = "Yes";
		}
		if (anotherQuestion.equals("No")) {
			continue_on = "No";
		}
		if (!anotherQuestion.equals("Yes") && !anotherQuestion.equals("No")) {
			System.out.println("Respond with a Yes or a No");
			yesOrNoQuestion(anotherQuestion());
			}
		}
	    public void getResponseTwo(){
		   	for(int i=0; i<responses.length; i++);
	    	System.out.println(responses[(random_response)]);
	    }
}