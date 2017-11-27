class coffeeCup{

	int [][] cups = new int [4][4]; //2D array

	
	public void setShop(int col, int row, int value){
		cups [row][col] = value;
	}

	public void displayCups(){
		System.out.println("_____________");
		System.out.println("| " + cups [0][0] + " | " + cups [0][1] + " | " + cups [0][2] + " |" + cups [0][3]);
		System.out.println("-------------");
		System.out.println("| " + cups [1][0] + " | " + cups [1][1] + " | " + cups [1][2] + " |" + cups [1][3]);
		System.out.println("-------------");
		System.out.println("| " + cups [2][0] + " | " + cups [2][1] + " | " + cups [2][2] + " |" + cups [2][3]);
		System.out.println("-------------");
		System.out.println("| " + cups [3][0] + " | " + cups [3][1] + " | " + cups [3][2] + " |" + cups [3][3]);	
		System.out.println("_____________");
		}

	/*public String[][] getCups(){
		return;
		}
*/
}
