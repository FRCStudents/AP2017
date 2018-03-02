public class Driver {

	public static void main(String[] args){
		
		BigAC bc = new BigAC();

			bc.turnOnAC();
			bc.turnOffAC();
			System.out.println(bc);

		LittleAC lc = new LittleAC();

			lc.turnOnAC();
			lc.turnOffAC();
			System.out.println(lc);

		VeryBigAC vbc = new VeryBigAC();

			vbc.turnOnAC();
			vbc.turnOffAC();
			System.out.println(vbc);

		Chain c = new Chain();

			System.out.println("Set chain: ");
			c.showChain();
			c.setChain();

			System.out.println("Unset chain: ");
			c.showChain();
	}
}