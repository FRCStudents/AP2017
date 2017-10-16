
class Junk {

  public static void waitUp(){
          try{
              Thread.sleep(1000);
          }
          catch(InterruptedException ex) {
              Thread.currentThread().interrupt();
          }
  }

  public static void main(String [] argv){
	System.out.print("\nYada");
	waitUp();	
	System.out.print("\rGive me a break");
	waitUp();
	System.out.print("\rNo, Yada!      ");
	waitUp();
	System.out.print("\rRight. Give me a break!");
	waitUp();
	System.out.println("");
	}
}
