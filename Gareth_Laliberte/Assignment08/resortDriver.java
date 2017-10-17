class resortDriver {
	public static void main(String[] argv) {
		resort r = new resort(Integer.parseInt(argv[0]));
		System.out.println(r.returnActivity());

	}
}