class Problem4 {
	public static void ifDivisible(int num){
		if(num%6 == 0){
			System.out.println("Hah ha 6-divisible dude");
		} else {
			System.out.println("(Bummer and a half");
		}
	}
	public static void main(String[] argv){
		ifDivisible(24);
	}
}