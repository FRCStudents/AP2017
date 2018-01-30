public class CoffeeCupDriver{

	public static void main(String[] argv){

		CoffeeCup b = new CoffeeCup();
		
		for(int c = 0; c < 50; c++){
		}

		System.out.println("");
		b.setTable(0, 0, "     ");
		b.setTable(0, 1, "     ");
		b.setTable(0, 2, "   ");
		b.setTable(0, 3, "  O ");
		b.setTable(1, 0, "     ");
		b.setTable(1, 1, "     ");
		b.setTable(1, 2, " O ");
		b.setTable(1, 3, "    ");
		b.setTable(2, 0, "     ");
		b.setTable(2, 1, " O   ");
		b.setTable(2, 2, "   ");
		b.setTable(2, 3, "    ");
		b.setTable(3, 0, "     ");
		b.setTable(3, 1, "     ");
		b.setTable(3, 2, "   ");
		b.setTable(3, 3, "    ");
		

		b.showTable();
	}
}