
class Car {
	char direction;
	int speed;
	int d = 0;

	public Car(){
		direction = 'r';
		speed = 0;
		}

  public void waitUp(){
          try{
              Thread.sleep(50 - speed);
          }
          catch(InterruptedException ex) {
              Thread.currentThread().interrupt();
          }
  }

 	public void increaseSpeed(){
		speed++;
	}

	public void decreaseSpeed(){
		speed--;
	}

	public void turnAround(){
		if(direction == 'r'){
			direction = 'l';
		}
		else {
			direction = 'r';
		}
	}

	private String makeSpace(int x){
		String s="";
		for(int i=x; i > 0; i--){
			s += ' ';
		}
	return s;
	}

	public void erase(){
		String s = "\n";
		for(int i=0; i<80; i++){
			s += "\n";
			}
		System.out.println(s);
	}

	public void increaseDistance(){
		if(direction == 'r'){
			if(d < 131){
				d++;
			}
			else {
				turnAround();
			}
		}
		if(direction == 'l'){
			if(d > 0){
				d--;
			}
			else {
				turnAround();
			}
		}
	}

	private void drawR(){
		System.out.println(makeSpace(d) + "     ***   ");
		System.out.println(makeSpace(d) + "O    ***   ");
		System.out.println(makeSpace(d) + " O ******>>");
		System.out.println(makeSpace(d) + "   ******>>");
		System.out.println(makeSpace(d) + "    *   *");
		}

	private void drawL(){
                System.out.println(makeSpace(d) + "  ***   ");
                System.out.println(makeSpace(d) + "  ***     O");
                System.out.println(makeSpace(d) + "<<****** O");
                System.out.println(makeSpace(d) + "<<******");
                System.out.println(makeSpace(d) + "  *   *");
                }

	public void draw(){
		if(direction == 'r') drawR();
		if(direction == 'l') drawL();
		}
}
