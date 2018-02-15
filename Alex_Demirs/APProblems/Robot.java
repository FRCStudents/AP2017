

public class Robot {
	private int[] hall;
	private int pos;
	private boolean facingRight;

public Robot() {
		hall = new int[4];
		hall[0] = 1;
		hall[1] = 1;
		hall[2] = 2;
		hall[3] = 2;
		pos = 1;
		facingRight = true;
	}


	private boolean forwardMoveBlocked()
	{
		if((facingRight==true&&pos==hall.length-1) || ((facingRight==false&&pos==hall.length-1))){
			return true;
		}else{
			return false;
		}
	}

	private void move()
	{
		if(hall[pos] > 0){
			hall[pos] = hall[pos]-1;
			return;
		}
		if((forwardMoveBlocked() == false) && (facingRight == true)){
			pos = pos + 1;
			return;
		}
		if((forwardMoveBlocked() == false) && (facingRight == false)){
			pos = pos - 1;
			return;
		}
		if((forwardMoveBlocked() == true) && (facingRight == true)){
			facingRight = false;
			return;
		}
		}
		
	



	public int clearHall(){
		int rank = 0;
		if(!hallIsClear()){
			move();
			rank++;
		}
			return rank;

}

	private boolean hallIsClear(){
		int x;
		if(hall[pos] > 0){
			return false;
		}
	return true;
	}
}