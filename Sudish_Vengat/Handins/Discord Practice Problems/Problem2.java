public class Problem2{
	
	static String s = "*";

	public static void star(){
		System.out.print(s);
	}

	public static void moreStars(){
		for(int i = 0; i <= 88; i++){
			star();
		}
	}

	public static void main(String[] args){
		moreStars();
	}
}



