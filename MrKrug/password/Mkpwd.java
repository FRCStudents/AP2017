
public class Mkpwd {
	private static String getPWD(String s){
		int total = 0;
		String pwd = "";

		for(int i=0; i < s.length(); i++){
			total += Character.getNumericValue(s.charAt(i));
			if(i % 2 == 0){
				if((s.charAt(i) > 'a' && s.charAt(i) < 'x') || 
							(s.charAt(i) > 'A' && s.charAt(i) < 'X')){
					pwd += (char)(s.charAt(i) + 2);
				}
			}	
		}
		return pwd + "#" + total;
	}


	public static void main(String[] argv){
		if(argv.length < 1){
			System.out.println("Use: java Mkpwd www.website.com/login");
			return;
		}

		String site = argv[0];
		System.out.println("[" + getPWD(site) + "]");
	}
}
