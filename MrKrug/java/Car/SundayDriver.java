
class SundayDriver {

	private static void __waitUp(){
                try{
                    Thread.sleep(50);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
  	}

 	public static void main(String [] argv){
		Car c = new Car();
		for(int i=0; i < 999; i++){
			c.increaseDistance();
			if(i % 20 == 0){
				c.increaseSpeed();
			}

			c.erase();
			c.draw();
			c.waitUp();
		}
	}
}
