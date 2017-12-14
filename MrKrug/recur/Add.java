
class Add {
	static int add (int a){
		if(a == 1) return 1;
		return add(a - 1) + 1;
	}

	public static void main(String[] argv){
		System.out.println(5 + add(4));
	}
}
