import java.util.*;

public class Robot {

	private int[] hall;
	private int pos;
	private boolean facingRight;

	public Robot(int firstSpot){
		pos = firstSpot;
		Random ran = new Random();
		facingRight = true;
		for (int i=0; i < 10; i++){
			hall[i] = ran.nextInt(5);
		}
	}

	private boolean forwardMoveBlocked() {
		if (pos + 1 == hall.length) {
			return true;
		} else {
			return false;
		}
	}

	/*private void move() {
		for (int j = pos; j < hall.length; j++) {
			for (int i = 0; i < hall[j]; i ++) {
				hall[j] = hall[j] - 1;
			}

			if (forwardMoveBlocked() = false){
				facingRight = false;
				continue;
			}
		}
	}*/

	public void move() {
		while (hall)
			if (hall[pos] != 0) {
				hall[pos] - 1;
			}

			if (hall[pos] == 0) {
				pos = pos + 1;
			}

			if (hall[pos + 1] == hall.length) {
				
			}
	}

	public int clearHall() {
	}

}