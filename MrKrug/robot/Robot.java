
import java.util.*;

public class Robot {
	private int[] hall = new int[10];
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

	public Robot(){
		this(3);
	}

	private boolean forwardMoveBlocked()
	{
		int lastPos = hall.length - 1;
		if((pos == 0) && !facingRight) return true;
		if((pos == lastPos) && facingRight) return true;
		return false;	
	}

	private void move()
	{
		if(hall[pos] > 0){
			hall[pos]--;
		}
		if(hall[pos] == 0){
			if(forwardMoveBlocked()){
				facingRight = !facingRight;
				return;
			}	
			if(facingRight) pos++;
			else pos--;
		}
	}

	private void displayHall(){
		System.out.println("");
		for(int i=0; i < hall.length; i++){
			System.out.print("[" + hall[i] + "]");
		}
		System.out.print(facingRight);
	}

	public int clearHall()
	{
		int moveCount = 0;

		while(!hallIsClear()){
			displayHall();
			move();
			moveCount++;
		}

		return moveCount;
	}

	private boolean hallIsClear()
	{
		for(int i=0; i < hall.length; i++){
			if(hall[i] > 0) return false;
		}
		return true;
	}
}
