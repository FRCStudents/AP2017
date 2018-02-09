class Problem7Driver{
	public static void main(String[] argv){
		Problem7 newNum = new Problem7(12);
		System.out.println(newNum.getNumber());
		Problem7 defaultNum = new Problem7();
		System.out.println(defaultNum.getNumber());
	}
}