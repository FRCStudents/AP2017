public class Robot {
	private int[] hall = new int[3];
	private int pos = 0;
	private boolean facingRight;

	// Constructor

	// postcondition: returns true if this Robot has a wall immediately in
	//	front of it, so that it can not move forward;
	//	otherwise, returns false

	private boolean forwardMoveBlocked()
	{
		if(pos == hall.length) return true;
		return false;
	}

	private void move()
	{
		if(hall[pos] > 0) hall[pos] = hall[pos] -1;
		if(hall[pos] ==0){
			if(!forwardMoveBlocked()) pos = pos +1;
			if(forwardMoveBlocked()){
				if (facingRight) facingRight = false;
				if (!facingRight) facingRight =true;
			}
		}
	}

	public int clearHall()
	{
		for (int i = 0; i > 0; i++){
			move();
			if(hallIsClear()) return i + 1;
		}
		return -1;
	}

	private boolean hallIsClear()
	{
		int counter = 0;
		for(int i = 0; i < hall.length; i++){
			if(hall[i] == 0) counter ++;
			if (counter == hall.length) return true;
		}
		return false;
	}

	public void setHall(int i, int j){
		hall[i] = j;
	}
}
