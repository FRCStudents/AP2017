import java.util.*;

		class Magic8Driver{
			public static void main(String[] argv) {
				Scanner s = new Scanner(System.in);
				Magic8 u = new Magic8();
				
				for (String x = u.Next; x.equals("Yes"); x = u.Next) {
					u.askQuestion();
					u.Answer();
					u.continueing(u.moreQuestion());
				}
			}	
		}