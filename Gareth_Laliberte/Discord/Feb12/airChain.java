public class airChain{

	private airConditioner[] a = new airConditioner[5];

	public airConditioner[] getA() {
		return a;
	}

	public void showChain() {
		for (int i = 0; i < a.length; i++) {
			a[i].putInBox();
		}
	}


	public airChain() {
		a[0] = new littleAC();
		a[0].setAC(0);

		a[1] = new bigAC();
		a[1].setAC(-10);

		a[2] = new veryBigAC();
		a[2].setAC(-100);

		a[3] = new bigAC();
		a[3].setAC(-10);

		a[4] = new littleAC();
		a[4].setAC(0);
	}

	

	public void setChain() {
		a[0] = new littleAC();
		a[0].setAC(1);

		a[1] = new bigAC();
		a[1].setAC(10);

		a[2] = new veryBigAC();
		a[2].setAC(100);

		a[3] = new bigAC();
		a[3].setAC(10);

		a[4] = new littleAC();
		a[4].setAC(1);
	}
}