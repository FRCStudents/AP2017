public class ACDriver {

	public static void main(String[] argv) {
		littleAC a = new littleAC();
		bigAC b = new bigAC();
		airChain c = new airChain();
//=====================================================================
		System.out.println("\n =========LITTLEAC=========");

		a.turnOnAC();
		System.out.println("LittleAC Turned on:" + l.getAC());

		a.turnOffAC();
		System.out.println("LittleAC Turned off:" + l.getAC());

		a.putInBox();
//=====================================================================
		System.out.println("\n =========BIGAC=========");

		b.turnOnAC();
		System.out.println("BigAC Turned On:" + b.getAC());

		b.turnOffAC();
		System.out.println("BigAC Turned Off:" + b.getAC());

		b.putInBox();
//=====================================================================
		System.out.println("=========AIRCHAIN=========");

		for (int i = 0; i < c.getA().length; i++) {
			System.out.print("[" + c.getA()[i].getAC() + "]");
		}

		c.setChain();

		for (int i = 0; i < c.getA().length; i++) {
			System.out.print("[" + c.getA()[i].getAC() + "]");
		}
	}
}