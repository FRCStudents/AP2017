
class Private2{
	private int i;
	private String n;

	Private2(){
			this(0, "");
	}

	Private2(int i, String n){
		this.i = i;
		this.n = n;
	}

	void checkNow(){
		System.out.println("in checkNow");
	}

	String toString(){
		return "Private2 object stuff";
	}
}
