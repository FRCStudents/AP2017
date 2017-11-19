class PalindromerinoDriver{
	public static void main (String [] argv){
		Palindromerino p = new Palindromerino ();

		p.setString("raxccar");
		System.out.println(p.palindromer());
		p.setString("Racecar");
		System.out.println(p.palindromer());
		p.setString("This is wrongT");
		System.out.print(p.palindromer());
	}
}
