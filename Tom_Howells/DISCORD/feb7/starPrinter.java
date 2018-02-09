class starPrinter {
	public static void main(String[] args) {
		printXTimes(20);
	}

	public static void printXTimes(int x) {
		int i = 0;
		while (i < x) {
			System.out.print("*");
			i++;
		}
	}
}