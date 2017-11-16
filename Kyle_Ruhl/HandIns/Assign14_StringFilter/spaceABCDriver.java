public class spaceABCDriver{

  public static void main(String[] args){
   
    spaceABC y = new spaceABC();
    
	y.reSpace();
    y.remixLetters();
	
	System.out.println();
    System.out.println("Your re-mixed sentence: " + y.reMixed);
			/*
			*This prints out the re-mixed sentence from spaceABC.java*
			*/
    System.out.println();
  }
}