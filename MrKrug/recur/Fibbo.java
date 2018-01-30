
class Fibbo {
	public static int fibbo (int f){
		if(f <  1) return 1;
		return fibbo(f - 2) + fibbo (f - 1); 
	}

	public static void main(String[] argv){
		for(int i=0; i < 20; i++)
		System.out.print("[" + fibbo(i) + "]");
	}
}
