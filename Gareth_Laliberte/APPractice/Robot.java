
public class Robot {
	private int[] hall;
	private int pos;
	private boolean facingRight;

	private boolean forwardMoveBlocked(){
		if(pos == hall.length && facingRight == true){	
			return true;
		}

		if(pos == hall[0] && facingRight == false){
			return true;
		}

		return false;
	}	

//position is the index in the array.
	public void move(){
		if(hall[pos] > 0){
			hall[pos]--;

		if(hall[pos] == 0){
			if(!forwardMoveBlocked()){
				if(facingRight){
					pos++;
					}
				if(!facingRight){
					pos--;
					}
				}
			}
		}
	}
	public boolean hallIsClear(){
		for(int i = 0; i < hall.length; i++){
			if(hall[i] > 0){
				return false;
				}
			}
			return true;
		}

	public int clearHall(){
		int c = 0;
		while(hallIsClear() == false){
			move();
			c++;
		}
		return c;
	}
	
}
