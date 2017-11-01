/*
 * Race
 */
import java.util.*;

public class Race {
    final int SWIMMER_COUNT = 5;
    Swimmer[] swimmers = new Swimmer[SWIMMER_COUNT];
    int[] lanes = new int[SWIMMER_COUNT];

    public Race(){
      for(int i=0; i < SWIMMER_COUNT; i++){
		  lanes[i] = -1;
        swimmers[i] = new Swimmer();
      }
    }

    public int getSwimmerCount(){
	return SWIMMER_COUNT;
	}

    public void acceptSwimmer(int swimmerIdx){
        Scanner s = new Scanner(System.in);
        swimmers[swimmerIdx].setName(s.next());
    }

    public void placeSwimmerInLane(int swimmerIdx, int lane){
		if((lane < 0) || (lane > SWIMMER_COUNT)) return;
      lanes[lane-1] = swimmerIdx;
    }

    public Swimmer getSwimmer(int i){
        return swimmers[i];
    }

    public void displaySwimmers(){
      for(int i=0; i < SWIMMER_COUNT; i++){
        System.out.println(swimmers[i]);
      }
    }
	
	public void displayLanes(){
		for(int i=0; i < SWIMMER_COUNT; i++){
			if(lanes[i] >= 0){
				System.out.println(lanes[i]);
			}
		}
	}

    public void displaySwimmersInLanes(){
      for(int i=0; i < SWIMMER_COUNT; i++){
		  if(lanes[i] < 0) continue;
        System.out.println("Lane " + (i + 1) + ": " + swimmers[lanes[i]]);
      }
    }
}
