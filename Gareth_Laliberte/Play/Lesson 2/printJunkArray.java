public class printJunkArray{
	
	static int[] junkArray = {1,2,3,4};
	
	static void printJunkArray(){

		for(int i = 0; i < junkArray.length; i++){
			System.out.println(junkArray[i]);
			}
			return;
		}

	static void printBackwardsArray(){
		for (int i = 3; i >= 0; i--){
				System.out.println(junkArray[i]);
			}
		}

	public static void main(String[] argv){
			//printJunkArray();
			printBackwardsArray();
		}
	}
