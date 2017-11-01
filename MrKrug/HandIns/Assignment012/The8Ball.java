import java.util.Random;

class The8Ball {

	final	String [] response =
		{"Concentrate and Ask Again",
		"Don't Count on It",
		"It Is Certain",
		"Most Likely",
		"My Reply is No",
		"My Sources Say No",
		"No",
		"Outlook Good",
		"Yes, Definitely",
		"You May Rely On It"};

	int responseIdx = 0;

	public The8Ball(){
		responseIdx = getResponseIdx();
	}

	public int getResponseIdx(){
		return (int)(Math.random() * (response.length - 1)); 
	}
	
	public String getResponse(){
		return response[getResponseIdx()];
	}
}

	
