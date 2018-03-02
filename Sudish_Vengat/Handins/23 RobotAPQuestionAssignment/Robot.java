public class Robot {

	//attributes
	public int pos;
	public boolean facingRight;
	public int[] hall = new int[5];

	//construtor sets infomration so the robot can run properly and pick up the objects in the tiles if tehre are objects.
	public Robot(){
		int pos = 1;
		facingRight = true;
		this.hall[0] = 0;
		this.hall[1] = 15;
		this.hall[2] = 33;
		this.hall[3] = 0;
		this.hall[4] = 21;
	}

	public boolean forwardMoveBlocked(){
		if(facingRight && pos == hall.length - 1) || (!facingRight && pos == 0){
			return true;
		} else {
			return false;
		}
	}

	public void move(){
		if(hall[pos] > 0){
			hall[pos]--;
		} 
		if(hall[pos] == 0){
			if(forwardMoveBlocked()){
				facingRight = !facingRight;
			} else {
				if(facingRight){
					pos++;
				} else {
					pos--;
				}
			}
		}	
	}

	public int clearHall(){
		int count = 0;
			while(!hallIsClear()){
				move();
				count++;
			}
		return count;
	}

	//used un order to make claearHall method works properly
	public boolean hallIsClear(){
		for(int j = 0; j < hall.length; j++){
			if(hall[j] > 0){
				return false;
			} else {
				return true;
			}
		}
	return true;
	}
}