class StringAnalyzer{
	String b = "zsqf bgb gr";
	char[] alphabet = new char[26];

	public void printString(){
		System.out.println(b);
	}

	public void despaceString(){
		b.replaceAll(" ";"");
		System.out.println(b);
	}
	public void reveal(){
			for (int j = 0; j < 26; j++) { 
				if (b.charAt(j) == alphabet[j]) {
					setIndex(j); 
				}
				b.replaceAll(b.charAt(j);alphabet[j+=2]);
			}	
		System.out.print.(b);
	}
}