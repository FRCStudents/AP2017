
class PeepleArrayGo2 {
	public static void main(String [] argv){
		PeepleArray2 pa = new PeepleArray2("Bill", "Jones", "6'-3\"", "23 Main Street, Sharon, MA", "617-784-3433");
		pa.setPeeple("Joe", "Smith", "5'-10\"", "18 Poplar Road, Dedham, MA", "617-998-5744");
		pa.setPeeple("Fred", "Happlesmith", "4'-10\"", "17 HalfPint Ave", "873-232-0392");
		System.out.println("========================================");
		pa.showAllPeeple();
	}
}

