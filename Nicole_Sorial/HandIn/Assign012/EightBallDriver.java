import java.util.*;


class EightBallDriver {
	public static void main(String[] argv) {

		Scanner s = new Scanner(System.in);
		EightBall e = new EightBall();

		for (String x = e.goOn; x.equals("Yes"); x = e.goOn) {
			e.askQuestion();
			e.formAnswer();
			e.yesOrNo(e.additionalQuestions());
		}
	}	
}
