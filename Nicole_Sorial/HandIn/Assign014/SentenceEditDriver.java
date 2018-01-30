class SentenceEditDriver {

	public static void main(String[] argv) {

		SentenceEdit e = new SentenceEdit();

		e.alphabet();
		e.printString(e.acceptString());
		e.printString(e.filterSpaces());
		e.printString(e.updateString());
	}
}