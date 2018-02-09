public class FileFive{
	
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