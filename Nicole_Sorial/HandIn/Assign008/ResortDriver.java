class ResortDriver {
	public static void main(String[] argv) {
		Resort r = new Resort(Integer.parseInt(argv[0]));
		System.out.println(r.returnActivity());

	}
}