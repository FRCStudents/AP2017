
class TryIt {
	public static String[][] arr = new String[4][5];

	public static void fillIt(){
		String [] arry = {"My", "Dog", "Has", "A", "Ukelele"};
		for(int i=0; i < 4; i++){
			arr[i] = varyIt(i, arry);
		}
	}

	public static String[] varyIt(int i, String[] pArry){
		String temp;
		String[] arry = new String[pArry.length];
		for(int k=0; k<pArry.length; k++){
			arry[k] = pArry[k];
		}
		if(i == 0) return arry;
		temp = arry[0];
		for(int j=0; j < arry.length - 1; j++){
			//System.out.println(arry[j + 1]);
			arry[j] = arry[j+1];
		}
		arry[arry.length - 1] = temp;
		return varyIt(i - 1, arry);
	}

	public static void main(String[] argv){
		fillIt();
		for(int i=0; i<4; i++){
			for(int j=0; j < 5; j++)
				System.out.print(arr[i][j]);
			System.out.println();
			}
	}
}
