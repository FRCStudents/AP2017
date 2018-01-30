
class Doit{
	static int i;
	static int j;
	static int[] intArray = new int[10];
	static String[] strArray = {	"Bill",
					"Will",
					"Phil",
					"Jill",
					"Dilbert"};

	private static void doIt(){ 
		i = 0;
		j = 0;
		System.out.println(">>>");
		for(int k=0; k<10; k++){
			System.out.print(k+2);
		}

		System.out.println("\n>>>");
		for(int k=0; k<10; k+=2){
			System.out.print(k);
		}

		System.out.println("\n>>>");
		for(int k=0; k<10; k+=i){
			i++;
			System.out.print(k);
		}
		System.out.println("\n>>>");	
		for(int k=2; k<5; k++){
			System.out.print(strArray[k]);
		} 
		System.out.println("\n>>>");
		for(int k=strArray.length-1; k >= 0; k--){
			System.out.print("[" + strArray[k] + "]");
		}
		System.out.println("\n>>>");
		for(int k=0; k < 4; k++){
			System.out.print(strArray[2].charAt(k));
		}
		System.out.println("\n>>>");
		for(int k=0; k < strArray.length; k++){
			System.out.print(strArray[k].indexOf("i"));
		}	
	}

	public static void main(String [] argv){
		doIt();
		}
}

