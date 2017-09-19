
class SReverse {

	String s1;
	String s2;

	SReverse (String s){
		s1 = s;
	}

	SReverse (){
		this("Mr. Krug");
	}

	public void doReverse(){
		int j;
		for(int i=0; i < s1.length(); i++){
			j = s1.length() - 1 - i;
		// 	System.out.print("[" + j + "/" + s1.charAt(j) + "]");
			s2 = s2 + s1.charAt(j);
			}
	}

	public String toString(){
		return "First: " + s1 + "/Second: " + s2.substring(4);
	}
}
