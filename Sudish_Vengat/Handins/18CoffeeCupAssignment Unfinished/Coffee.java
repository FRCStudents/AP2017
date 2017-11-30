public class Coffee {
	
	String [][] coffee = new String [4][4];

	public void setTable(int col, int row, int value){
		coffee [col][row] = value;
	}

	public void showTable(){
		System.out.println("_______________");
		System.out.println("| Price | White | Black | Red | Blue |");
		System.out.println("_______________");
		System.out.println("| 1.25 | " + coffee [0][0] + " | " + coffee [0][1] + " | " + coffee [0][2] + " | " + coffee [0][3] " |");
		System.out.println("_______________");
		System.out.println("| 2.25 | " + coffee [1][0] + " | " + coffee [1][1] + " | " + coffee [1][2] + " | " + coffee [1][3] " |");
		System.out.println("_______________");
		System.out.println("| 3.25 | " + coffee [2][0] + " | " + coffee [2][1] + " | " + coffee [2][2] + " | " + coffee [2][3] " |");
		System.out.println("_______________");
		System.out.println("| 4.99 | " + coffee [3][0] + " | " + coffee [3][1] + " | " + coffee [3][2] + " | " + coffee [3][3] " |");
		System.out.println("_______________");
	}

	public String getCoffee(){
		return coffee;
	}
}