public class StringFilterDriver{

  public static void main(String[] args){
   
    StringFilter y = new StringFilter();
    
	y.reSpace();
    y.remixLetters();
	
	System.out.println();
    System.out.println("Your re-mixed sentence: " + y.reMixed);
    System.out.println();
  }
}