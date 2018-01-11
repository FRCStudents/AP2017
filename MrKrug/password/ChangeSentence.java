
public class ChangeSentence {
	private static char changeIt(char c){
	System.out.print("[" + c + "]");
		for(int i=0; i < 10; i++){
			c = (char)(c - 1);
			if(c < 'a') c = 'z';
		}
	System.out.print("{" + c + "}");
	return c;
	}

	private static String getPWD(){
		String s = "interestingly enough the world is not flat";
		String pwd = "";

		for(int i=0; i < s.length(); i++){
			pwd += changeIt(s.charAt(i));
		}
		return pwd;
	}


	public static void main(String[] argv){
		System.out.println(getPWD());
	}
}
