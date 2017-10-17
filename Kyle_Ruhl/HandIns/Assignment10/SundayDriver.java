//This driver and car was based on Tom's through help from him but I modified it

class SundayDriver {
  
	public static void print80Lines(){
        for (int a = 0; a < 80; a++){
            System.out.println( );
        }
    }

    public static void wait(int length){
        try {
            Thread.sleep(length);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        MyCar a = new MyCar();
        int k = 0;

        while(k < 1){
            for (int i = 0; i < 80; i += 3){
                print80Lines();
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(0));
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(1));
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(2));
                System.out.println(a.repeatString(" ", i) + a.getForwardVisual(3));
                wait(80);
            }

            for (int i = 80; i > 0; i -= 3){
                print80Lines();
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(0));
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(1));
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(2));
                System.out.println(a.repeatString(" ", i) + a.getBackwardVisual(3));
                wait(80);
            }

            k++;
        }
		print80Lines();
		System.out.println("Sorry. The Sunday Drive has ended in the pit of death.");
		for (int w = 0; w < 5; w += 1){
			System.out.println("");
			} 
			

			wait(100);
			System.out.println(":(");
			System.out.println("");
    }
}
