import java.util.*;


public class EightBallDriver {
	
	public static void main(String[] argv) {

		Scanner s = new Scanner(System.in);
		
		EightBall e = new EightBall();

		for(String b = e.continue_on; b.equals("Yes"); b = e.continue_on) {
			e.getResponse();
			e.askQuestion();
			e.yesOrNoQuestion(e.anotherQuestion());
		}
	}	
}