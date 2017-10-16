class ResortDriver{
	public static void main(String[] args){
		Resort a = new Resort(Integer.parseInt(args[0]));

		System.out.println(a.determineActivity());
	}
}