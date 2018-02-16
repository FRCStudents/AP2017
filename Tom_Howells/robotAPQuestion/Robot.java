public class Robot {
   private int[] hall;
	private int pos;
	private boolean facingRight;

	public Robot(int[] h, int p) {
      hall = h;
      pos = p;
   }

	private boolean forwardMoveBlocked() {
      if (pos == 3 && facingRight) {
         return true;
      } else {
         return false;
      }
	}

	private void move() {
		if (hall[pos] > 0) {
         hall[pos]--;
      } else if (facingRight && !forwardMoveBlocked()) {
         pos++;
      } else if (!facingRight) {
         pos++;
      } else if (forwardMoveBlocked()) {
         facingRight = false;
      }
	}

	public int clearHall() {
		int count = 0;
      while(!hallIsClear()) {
         move();
         count++;
      }
      return count;
	}

	private boolean hallIsClear() {
		// implementation not shown
	}
}