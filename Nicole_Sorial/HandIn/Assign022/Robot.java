public class Robot {
	private int[] hall;
	private int pos;
	private boolean facingRight;

	// From here until *END*, code was added to what was done for AP 
	// question so that driver would work
	// Constructor
	public Robot() {
		hall = new int[4];
		hall[0] = 1;
		hall[1] = 1;
		hall[2] = 2;
		hall[3] = 2;
		pos = 1;
		facingRight = true;
	}

	public int[] getHall() {
		return hall;
	}

	public int getPos() {
		return pos;
	}

	public boolean getFacingRight() {
		return facingRight;
	}

	public boolean getHallIsClear() {
		return hallIsClear();
	}

	// *END*

	// postcondition: returns true if this Robot has a wall immediately in
	//	front of it, so that it can not move forward;
	//	otherwise, returns false

	private boolean forwardMoveBlocked() {
		if (facingRight && pos == 3) {
			return true;
		} else if (!facingRight && pos == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void move() {
		if (hall[pos] > 0) {
			hall[pos] = hall[pos] - 1;
		}
		if (hall[pos] == 0) {
			if (forwardMoveBlocked()) {
				facingRight = !facingRight;
			} else if (facingRight) {
				pos++;
			} else {
				pos--;
			}
		}
	}

	public int clearHall() {
		int moves = 0;
		while (!hallIsClear()) {
			move();
			moves++;
		}
		return moves;
	}

	private boolean hallIsClear() {
		int len = hall.length;
		for (int i = 0; i < len; i++) {
			if (hall[i] != 0) {
				return false;
			}
		}
		return true;
	}
}