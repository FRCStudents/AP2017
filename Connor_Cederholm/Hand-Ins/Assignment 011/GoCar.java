class GoCar{
	String space = " ";
	public void waitUp(){
		try{
			Thread.sleep(20);
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}

	public String drawforwardCar(String s){
		System.out.println( s+ "_____");
		System.out.println(s+"/     \\" );
		System.out.println(s+"[         ]");  
		System.out.println(s +"( )   ( )");
		s = space;
	}		
	public void wipe(){
		for (int i = 0; i < 80; i++){
			System.out.println(" ");
		}
	}
	public void moveRight(){
		for (int i = 0; i < 2; i++){
			space = space +" ";

		}
	}

	public void drive(){
		for (int i = 0; i < 50; i++){
			drawforwardCar();
			waitUp();
			wipe();
			waitUp();
			moveRight();
			
		}
	}
}