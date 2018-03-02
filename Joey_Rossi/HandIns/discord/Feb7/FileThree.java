class FileThree{

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
}