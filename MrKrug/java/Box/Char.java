
class Char {
	public static void main(String[] argv){
		boolean x = false;
		boolean justAlpha = false;

		int i = 0;
		char c = 0;
		if(argv.length > 0){
			if(argv[0].equals("char")){
				justAlpha = true;
				}
			x = true;
			}
		while (c < 256){
			if(justAlpha){
				if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
					System.out.println(c + " [" + i + "]");
					}
			} else {
				if(x)
					System.out.print(c + "[" + i + "]");
				else
					System.out.print(c);
			}
			i++;
			c++;
			}
	}
}
