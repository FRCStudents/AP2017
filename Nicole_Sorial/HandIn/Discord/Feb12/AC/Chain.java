public class Chain {

	private AC[] a = new AC[5];

	public Chain() {
		a[0] = new LittleAC();
		a[0].setAC(0);

		a[1] = new BigAC();
		a[1].setAC(-10);

		a[2] = new VeryBigAC();
		a[2].setAC(-100);

		a[3] = new BigAC();
		a[3].setAC(-10);

		a[4] = new LittleAC();
		a[4].setAC(0);
	}

	public AC[] getA() {
		return a;
	}

	public void showChain() {
		for (int i = 0; i < a.length; i++) {
			a[i].putInBox();
		}
	}

	public void setChain() {
		a[0] = new LittleAC();
		a[0].setAC(1);

		a[1] = new BigAC();
		a[1].setAC(10);

		a[2] = new VeryBigAC();
		a[2].setAC(100);

		a[3] = new BigAC();
		a[3].setAC(10);

		a[4] = new LittleAC();
		a[4].setAC(1);
	}
}