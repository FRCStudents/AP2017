class cardDriver{
public static void main (String[] argv){

	card a = new card();
	card b = new card();
	//System.out.println(a.isEqual(b));
  System.out.println("Information for Card 'A'");
  a.displaySuit(a);
  a.isEqual(a);
  a.printCard();
  a.toString();
 
  System.out.println("Information for Card 'B'");
  b.displaySuit(b);
  b.isEqual(b);
  b.printCard();
  b.toString();
  
  
 }
}
