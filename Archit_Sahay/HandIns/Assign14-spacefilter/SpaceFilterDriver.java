public class SpaceFilterDriver{

  public static void main(String[] args){
   
    SpaceFilter s = new SpaceFilter();
    
	s.WithoutSpaces();
    s.Incrementer();
	
	  System.out.println();
    System.out.println("Your incremented sentence: " + s.Increment);
    System.out.println();
  }
}