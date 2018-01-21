
class SObj {
	static int staticInt = 0;
	public SObj(){
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
}
