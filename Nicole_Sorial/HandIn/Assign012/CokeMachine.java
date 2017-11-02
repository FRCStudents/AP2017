class CokeMachine {
	public static void main(String[] argv) {

		Machine m = new Machine();

		for (String x = m.goOn; x.equals("Yes"); x = m.goOn) {
			m.displayOptions();
			m.acceptDrink();
			m.acceptMoney();
			m.determineMoney();
			m.yesOrNo(m.additionalDrinks());
		}
	}
}