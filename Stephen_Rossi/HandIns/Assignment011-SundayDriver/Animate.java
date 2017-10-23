class Animate {

  public static void waitUp(int value){
          try{
              Thread.sleep(value);
          }
          catch(InterruptedException ex) {
              Thread.currentThread().interrupt();
          }
  }

  public static void main(String [] argv){

		for(int i = 0; i <= 10; i ++) {
			System.out.print("\r The answer is: " + i);
			waitUp(150);
		}
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    for(int x = 0; x < 20; x++) {
      System.out.print("\r");
      for(int y = 0; y < x; y++){
        System.out.print(" ");
      }
      System.out.print("*");
      waitUp(20);
    }
	}
}
