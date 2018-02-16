public class Robot {
	private int[] hall = new int[4];
	private int pos;
	private boolean facingRight;

	public Robot() {
			this.hall[0] = 1;
			this.hall[1] = 0;
			this.hall[2] = 4;
			this.hall[3] = 4;
			pos = 1;
			facingRight = true;
		}
	

	private boolean forwardMoveBlocked(){
		return (facingRight && pos == hall.length-1) || (!facingRight && pos == 0);
	}
	

	private void move(){
		if (hall[pos] > 0){
			hall[pos]--;
		}

		if (hall[pos] == 0){
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
	

	public int clearHall(){
		int amountOfMoves = 0;
			while(hallIsClear()!=true){
				move();
				amountOfMoves++;		
				}
		return amountOfMoves;
	}
	

	private boolean hallIsClear(){
		for(int i=0; i < hall.length; i++){
			if(hall[i] > 0) return false;
		}
		return true;

	}
}