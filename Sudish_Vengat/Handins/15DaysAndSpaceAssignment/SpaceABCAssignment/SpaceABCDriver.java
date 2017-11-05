public class SpaceABCDriver{

  public static void main(String[] args){
   
    SpaceABC s = new SpaceABC();
    
	s.spaceAgain();
    s.remixedLettersX();
    s.remixedLettersY();
    s.remixedLettersZ();
	
	System.out.println();
    System.out.println("Your re-mixed sentence: " + s.mixedAgain);
    System.out.println();
  }
}