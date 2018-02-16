public class Robot {
	private int[] hall = new int[4];
	private int pos;
	private boolean facingRight;

	public Robot() {
			this.hall[0] = 12;
			this.hall[1] = 23;
			this.hall[2] = 100;
			this.hall[3] = 40;
			pos = 1;
			facingRight = true;
		}

	// postcondition: returns true if this Robot has a wall immediately in
	//	front of it, so that it can not move forward;
	//	otherwise, returns false
	
	//*************************** PART A *************************

	private boolean forwardMoveBlocked(){
		return (facingRight && pos == hall.length-1) || (!facingRight && pos == 0);
	}
	
	//*************************** PART B *************************

	private void move(){
		if (hall[pos] > 0)
			//removes 1 toy if there are toys on that tile
			hall[pos]--;

		if (hall[pos] == 0){
			//this executes once all the toys are removed from the square tile thing
			if(forwardMoveBlocked()){
			facingRight = !facingRight;
					return;
			}else{
				if(facingRight){
					pos ++;
					}else{
						pos--;
						}
			}
		}
	}
	
	//************************* PART C *************************************

	public int clearHall(){
		//this method returns the number of moves it takes to clear the hall
		int counter = 0;
			while(!hallIsClear()){
				move();
				counter++;		
				}
		return counter;
	}
	
	//************** ADDED (but "implemented" in the AP question) *************

	private boolean hallIsClear(){
		for(int i=0; i < hall.length; i++){
			if(hall[i] > 0) return false;
		}
		return true;

	}
}