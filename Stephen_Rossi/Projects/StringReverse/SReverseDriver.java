
class SReverseDriver {

	public static void main(String [] argv){
		String s;
		if(argv[0].equals("")){
			s = "Mr Krug";
 		} else {
			s = argv[0];
		}

		SReverse sr = new SReverse(s);
		sr.doReverse();
		System.out.println(sr);
	}
}

		
