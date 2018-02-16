
public class Driver {
	public static void main(String [] argv){
		LittleAC lAC = new LittleAC();
		BigAC bAC = new BigAC();
		VeryBigAC vbAC = new VeryBigAC();

		lAC.turnOnAC();
		bAC.turnOnAC();
		vbAC.turnOffAC();

		System.out.println(lAC.getAC());
		System.out.println(bAC.getAC());
		lAC.putInBox();
		bAC.putInBox();
		vbAC.putInBox();

		Chain c = new Chain();
		c.showChain();
		c.turnOnMembers();
		c.showChain();
  	}
}
