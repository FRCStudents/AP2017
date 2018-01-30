
class SObj {
	static int staticInt = 0;
	// tracks how many SObj objects are created!
	public static int SObjCount = 0;
	public static int pubStatInt = 0;

	public SObj(){
		SObjCount++;
		if(staticInt > 2) 
			staticInt+=2 ;
		else
		staticInt++;
	}

	public void upStaticInt(){
		staticInt++;
	}

	public int getStaticInt(){
		return staticInt;
	}

	public static int getPubStatInt(){
		return pubStatInt;
	}

	public static void incPubStatInt(){
		pubStatInt++;
	}
}
