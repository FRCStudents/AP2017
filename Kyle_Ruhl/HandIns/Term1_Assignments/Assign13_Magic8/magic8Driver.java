import java.util.*;

		class magic8Driver{
			public static void main(String[] argv) {
				Scanner s = new Scanner(System.in);
				magic8 u = new magic8();
				
				for (String x = u.goOn; x.equals("Yes"); x = u.goOn) {
					u.askQuestion();
					u.Answer();
					u.continueing(u.anotherQuestion());
				}
			}	
		}