public class FileFive{
		public static void Star(){
		for (int i = 0; i < 9; i++){
			System.out.print("*");
		}
	}
	public static void main(String [] argv){
		System.out.print("Yo, Dudele!");
		Star();
	}
	
	public void theMessage(String y){
		System.out.println("This is the \"String\", you know:(" + y+ ")");
	}
	
	public void sixy(int i){
		if (i%6 == 0){
		 System.out.print("Ha ha 6-Divisor Dude");
		}else{
			System.out.print("Bummer and a half");
		}

	}
	
	public void giveIt(boolean a){
		if (a){
			System.out.print("Whew");
		}else{
			System.out.print("drag");
		}
	}

	public boolean takeIt(String str){
		if((str.charAt(0) == 'a') || (str.charAt(0) == 'e') || (str.charAt(0) == 'i') || (str.charAt(0) == 'o') || (str.charAt(0) == 'u')) return true;
		return false; 
	}
}